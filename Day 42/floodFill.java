// 733. Flood Fill

public class floodFill {
    public int[][] floodF(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;
        int newColor = image[sr][sc];
        fun(image, sr, sc, color, newColor);
        return image;
    }

    public void fun(int[][] image, int sr, int sc, int color,int newColor){
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != newColor) return;
        image[sr][sc] = color;
        fun(image, sr+1, sc, color, newColor);
        fun(image, sr-1, sc, color, newColor);
        fun(image, sr, sc+1, color, newColor);
        fun(image, sr, sc-1, color, newColor);
    }
}
