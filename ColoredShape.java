import javax.media.j3d.*;
import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.universe.SimpleUniverse;
import javax.vecmath.*;

public class ColoredShape {
    public ColoredShape() {
        SimpleUniverse universe = new SimpleUniverse();
        BranchGroup group = new BranchGroup();

        // Create a colored cube
        ColorCube coloredCube = new ColorCube(0.4);
        Appearance coloredAppearance = new Appearance();
        ColoringAttributes colorAttrib = new ColoringAttributes();
        colorAttrib.setColor(new Color3f(0.8f, 0.2f, 0.2f));
        coloredAppearance.setColoringAttributes(colorAttrib);
        coloredCube.setAppearance(coloredAppearance);

        // Add the colored cube to the scene
        group.addChild(coloredCube);

        // Set up the viewing platform
        universe.getViewingPlatform().setNominalViewingTransform();
        universe.addBranchGraph(group);
    }

    public static void main(String[] args) {
        new ColoredShape();
    }
}
