package Easy;

import java.util.Arrays;

public class FloodFill {
    // #733
    public static void main(String[] args) {
        int[][] image = { { 1, 1, 1 },
                { 1, 2, 1 },
                { 1, 1, 1 } };
        // int[][] image = {{1}};
        image = floodFill(image, 0, 0, 3);
        System.out.println(Arrays.toString(image));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color){
            return image;
        }
        fillGrid(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    public static void fillGrid(int[][] image, int sr, int sc, int color, int val) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != val) {
            return;
        }
        image[sr][sc] = color;
        // Up
        fillGrid(image, sr, sc - 1, color, val);
        // Down
        fillGrid(image, sr, sc + 1, color, val);
        // Left
        fillGrid(image, sr - 1, sc, color, val);
        // Right
        fillGrid(image, sr + 1, sc, color, val);

        image[sr][sc] = color;
    }
}
