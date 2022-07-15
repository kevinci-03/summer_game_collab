package lib;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.shape.Box;
import com.jme3.scene.shape.Sphere;
import com.jme3.system.AppSettings;
import com.jme3.audio.openal.ALAudioRenderer;

    public class Main extends SimpleApplication {

        public static void main(String[] args) {

            Main app = new Main();

            AppSettings settings = new AppSettings(true);
            settings.setTitle("My Awesome Game");
            app.setSettings(settings);

            app.start();

        }

        @Override
        public void simpleInitApp() {
            /*
            Box b = new Box(1, 1, 1);
            Geometry geom = new Geometry("Box", b);
            geom.setLocalTranslation(new Vector3f(1, -1, 1));


            Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
            mat.setColor("Color", ColorRGBA.Blue);
            geom.setMaterial(mat);
            */
            /*
            Box box2 = new Box(1,1,1);
            Geometry red = new Geometry("Box", box2);
            red.setLocalTranslation(new Vector3f(1,3,1));
            Material mat2 = new Material(assetManager,
                    "Common/MatDefs/Misc/Unshaded.j3md");
            mat2.setColor("Color", ColorRGBA.Red);
            red.setMaterial(mat2);

            Node pivot = new Node("pivot");
            rootNode.attachChild(pivot); // put this node in the scene

            pivot.attachChild(geom);
            pivot.attachChild(red);
            pivot.rotate(.4f,.4f,0f);
            */

            Sphere s = new Sphere(16, 16, 1);
            Box b1 = new Box(Vector3f.ZERO, 1, 1, 1);
            Geometry geom1 = new Geometry("Box", s);
            Material mat1 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
            mat1.setColor("Color", ColorRGBA.Blue);
            geom1.setMaterial(mat1);
            rootNode.attachChild(geom1);


        }

        @Override
        public void simpleUpdate(float tpf) {
            //TODO: add update code
        }

    }
