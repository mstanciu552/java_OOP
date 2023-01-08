import java.util.Random;

public class Exercitiul9 {
    double[][] mat;

    void init(int n, int m, int min, int max) {
        Random rand = new Random();
        this.mat = new double[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                this.mat[i][j] = rand.nextInt(max - min) + min;
    }

    void afisare() {
        for (double[] lines : this.mat)
            for (double element : lines)
                System.out.println(element);
    }
}
