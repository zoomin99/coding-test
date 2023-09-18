import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        int dx = 1;
        int dy = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int width = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int time = Integer.parseInt(st.nextToken());
        int xTime = time % (width * 2);
        int yTime = time % (height * 2);

        for (int i = 0; i < xTime; i++) {
            x += dx;
            if (x == width || x == 0) {
                dx *= -1;
            }
        }

        for (int i = 0; i < yTime; i++) {
            y += dy;
            if (y == height || y == 0) {
                dy *= -1;
            }
        }

        System.out.println(x + " " + y);
    }
}