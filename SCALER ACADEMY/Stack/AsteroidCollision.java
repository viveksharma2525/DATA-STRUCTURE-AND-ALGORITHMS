import java.util.Stack;
/**
 * AsteroidCollision
 */
public class AsteroidCollision {
    public class Asteroid {
        public int[] Collision(int[] asteroids){
            Stack<Integer> stack = new Stack<>();
            for(int a : asteroids){
                
                boolean destroyed =  false;

                while (!stack.empty() && stack.peek()>0 && a<0) {
                    int collision = a + stack.peek();
                    if (collision < 0) {
                       stack.pop();
                    }
                    else if (collision > 0) {
                        destroyed = true;
                        a = 0;
                    }
                    else{
                        destroyed= true;
                        stack.pop();
                    }
                    if (!destroyed) {
                        stack.push(a);
                    }
                }
            }
            int [] result = new int[stack.size()];
            for (int i = stack.size()-1; i>=0 ; i--) {
                result[i] = stack.pop();
            }
            return result;
        }
    }
}