package ImageProcessor.factory;

import ImageProcessor.action.ImageAction;
import ImageProcessor.service.ActionsConfigService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImageActionFactory {

    private ActionsConfigService configService;

    private Map<String, ImageAction> imageActionsMap = new HashMap<>();

    public ImageActionFactory(ActionsConfigService configService) throws Exception {
        this.configService = configService;

        List<String> actionClassNames = configService.getActionClassNames();
        String actionPackage = configService.getActionPackage();

        for(String className:actionClassNames) {
            ImageAction imageAction = (ImageAction) Class.forName(actionPackage + "." + className)
                    .getConstructor()
                    .newInstance();
            imageActionsMap.put(imageAction.getName(), imageAction);
        }
    }

    public ImageAction getAction(String actionName) {
        ImageAction imageAction = imageActionsMap.get(actionName);
        return imageAction;
    }

    public static void main(String[] args) throws Exception{

        ImageActionFactory factory = new ImageActionFactory(new ActionsConfigService());

        ImageAction preview = factory.getAction("PREVIEW");
        preview.doAction(null);
        ImageAction grasc = factory.getAction("GRAYSCALE");
        grasc.doAction(null);

        ImageAction newAction = factory.getAction("NEW ACTION");
        newAction.doAction(null);

        ImageAction aDefault = factory.getAction("DEFAULT");
        aDefault.doAction(null);
    }
}