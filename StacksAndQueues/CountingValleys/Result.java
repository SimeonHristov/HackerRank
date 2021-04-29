package StacksAndQueues.CountingValleys;

import java.util.*;

class Result {

//    int steps = Integer.parseInt(bufferedReader.readLine().trim());
//    String path = bufferedReader.readLine();
//    int result = Result.countingValleys(steps, path);

    public static int countingValleys(int steps, String path) {
        int count =0;
        int nextStep = -1;
        ArrayDeque<Integer>stack = new ArrayDeque<>();

        while (++nextStep < steps){
            boolean isValley = path.charAt(nextStep) == 'D';
            stack.push(0);
            while (!stack.isEmpty() && ++nextStep<steps){
                if(isValley) {
                    if (path.charAt(nextStep) == 'D') {
                        stack.push(0);
                    } else {
                        stack.pop();
                    }
                }else{
                    if (path.charAt(nextStep) == 'D') {
                        stack.pop();
                    } else {
                        stack.push(0);
                    }
                }
            }
            if (isValley){
                count++;
            }
        }
        return count;
    }

}

