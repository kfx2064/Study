package Exe01;

import java.util.ArrayList;

public class Test01 {

    public static int solution(int N) {
        // write your code in Java SE 8

        ArrayList<String> cuttingStrList = new ArrayList<String>();

        boolean tfLoop = true;
        String strBinary = Integer.toBinaryString(N);
        int countingLoop = 0;
        while(tfLoop) {
            System.out.println(strBinary);

            int stIdx = strBinary.indexOf("10");
            int trueStIdx = stIdx + 1;
            System.out.println(trueStIdx);

            int edIdx = strBinary.indexOf("01");
            int trueEdIdx = edIdx + 1;
            System.out.println("trueEdIdx : " + trueEdIdx);

            String fSubStr = String.valueOf("");
            String cutStr = String.valueOf("");
            // 0이면 더 이상 뒤에 바이너리 갭이 없다는 뜻이다.
            if(trueEdIdx == 0) {
                fSubStr = strBinary.substring(trueStIdx);
                // 잘라진 0으로 이루어진 바이너리 갭을 담는다.
                cuttingStrList.add(fSubStr);
                tfLoop = false;
            } else {
                fSubStr = strBinary.substring(trueStIdx, trueEdIdx);
                // 잘라진 0으로 이루어진 바이너리 갭을 담는다.
                cuttingStrList.add(fSubStr);
                cutStr = strBinary.substring(trueEdIdx);
                System.out.println(cutStr);
                strBinary = String.valueOf(cutStr);
            }

            System.out.println("fSubStr : " + fSubStr);

            countingLoop++;
        }

        // 잘라진 바이너리 갭을 가진 리스트를 반복문으로 풀면서 길이를 가져온다.
        ArrayList<Integer> lengthList = new ArrayList<Integer>();
        boolean isThereNoneBinaryGap = false;
        for(int i = 0; i < cuttingStrList.size(); i++) {

            if(cuttingStrList.size() == 1) {
                String getStrData = cuttingStrList.get(i);
                if(getStrData.indexOf("1") > -1) {
                    lengthList.add(0);
                    isThereNoneBinaryGap = true;
                    break;
                } else if(countingLoop == 1) {
                    lengthList.add(0);
                    isThereNoneBinaryGap = true;
                    break;
                }
            }

            String getListData = cuttingStrList.get(i);
            int dataLength = getListData.length();
            System.out.println("i : " + i + ",,, Data length : " + dataLength);
            lengthList.add(dataLength);
        }

        int stdLength = 0;
        int result = 0;
        if(isThereNoneBinaryGap) {
            result = 0;
        } else {
            for(int i = 0; i < lengthList.size(); i++) {
                int arrayData = lengthList.get(i);
                if(stdLength < arrayData) {
                    stdLength = arrayData;
                }
                if(i == (lengthList.size() - 1)) {
                    result = stdLength;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int getResult = solution(9);
        System.out.println(getResult);
    }

}
