package com.study.java_study.발표;

public class 중복X {
    public static void main(String[] args) {





                int[] nums = new int[] {1, 2, 3};

                for(int num : nums) {   // nums배열 -> 1, 2, 3
                    System.out.println(num);
                }

                // < nums 배열에 중복되는 값이 있는지 확인하고 없으면 추가 >











                int addNum = 2; // 추가할 값

                boolean isDuplicate = false;
                for(int num : nums) {   // 배열에 추가할 값이 이미 있는지 확인
                    if(num == addNum) {
                        isDuplicate = true;
                        break;
                    }
                }








                if(!isDuplicate) {
                    int[] newNums = new int[nums.length + 1];   // 기존 배열보다 크기가 1이 더 큰 배열 생성

                    for(int i = 0; i < nums.length; i++) {  // 새로운 배열에 기존 값 추가
                        newNums[i] = nums[i];
                    }
                    nums = newNums; // 기존 배열 주소의 변수에 새 배열의 주소 대입

                    nums[nums.length - 1] = addNum;  // 새 배열의 마지막 인덱스에 값 추가
                }








                for(int num : nums) {   // nums배열 -> 1, 2, 3
                    System.out.println(num);
                }
















    }
}
