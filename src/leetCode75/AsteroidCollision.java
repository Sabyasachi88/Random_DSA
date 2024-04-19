package leetCode75;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AsteroidCollision {

    public static void main(String args[]){
        System.out.print(asteroidCollision(new int[]{8,-8}));
    }


    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(Integer ast : asteroids){

            if(stack.isEmpty() || ast> 0){
                stack.push(ast);
            }else {
                while(true){
                    int peek = stack.peek();
                    if(peek < 0 ){
                        stack.push(ast);
                        break;
                    }else if(peek ==  -ast){
                        stack.pop();
                        break;
                    }else if(peek >  -ast){
                        break;
                    }else {
                        stack.pop();
                        if(stack.isEmpty()){
                            stack.push(ast);
                            break;
                        }
                    }
                }
            }

        }

        int[] output = new int[stack.size()] ;
        for(int i= stack.size() -1; i>=0; i--){
            output[i] = stack.pop();
        }

        return output;

    }
}
