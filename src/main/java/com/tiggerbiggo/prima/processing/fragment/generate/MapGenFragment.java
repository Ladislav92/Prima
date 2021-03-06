package com.tiggerbiggo.prima.processing.fragment.generate;

import com.tiggerbiggo.prima.core.Vector2;
import com.tiggerbiggo.prima.gui.ControlPane;
import com.tiggerbiggo.prima.gui.components.VectorPane;
import com.tiggerbiggo.prima.processing.fragment.Controllable;
import com.tiggerbiggo.prima.processing.fragment.Fragment;

import java.io.Serializable;

public class MapGenFragment implements Fragment<Vector2>, Serializable, Controllable {
    double aX, aY, dx, dy;

    public MapGenFragment(Vector2 A, Vector2 B) {
        aX = A.X();
        aY = A.Y();

        dx = B.X() - aX;
        dy = B.Y() - aY;
    }

    @Override
    public Vector2 get(int x, int y, int w, int h, int num){
        Vector2 v = new Vector2(
                aX+(x*(dx/w)),
                aY+(y*(dy/h))
        );
        System.out.printf("x: %d, y: %d, w: %d, h: %d, Vector: " + v + "\n", x, y, w, h);
        return v;
    }

//    @Override
//    public Fragment<Vector2>[][] build(int xDim, int yDim) throws IllegalMapSizeException {
//        Fragment<Vector2>[][] map = MapGenerator.getFragMap(xDim, yDim, A, B);
//        return map;
//    }
//
//    @Override
//    public Fragment<Vector2>[][] getArray(int xDim, int yDim) throws IllegalMapSizeException {return null;}
//
//    @Override
//    public Fragment<Vector2> getNew(int i, int j) {return null;}

    @Override
    public ControlPane getControls(ControlPane p) {
        if(p == null) return p;

        VectorPane aPane, bPane;

//        aPane = new VectorPane(A, -1000, 1000, 0.1);
//        bPane = new VectorPane(B, -1000, 1000, 0.1);
//
//        p.add(aPane);
//        p.add(bPane);

        return p;
    }
}
