package task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//1) Random클래스 이용해서 1부터 45중 임의의 숫자 뽑기
//2) List<> 객체 생성
//3) while문 사용해서 6개의 번호 뽑기
//3-2)  이미 포함된 숫자인지 contain사용해서 확인, 아니면 add
//4) Collections.sort 사용해서 정렬

public class LottoList {
	public static void main(String[] args) {
        Random random = new Random();

        List<Integer> lottoNum = new ArrayList<>();

        while (lottoNum.size() < 6) {
            int num = random.nextInt(45) + 1; 
            if (!lottoNum.contains(num)) { 
            	lottoNum.add(num);
            }
        }

        Collections.sort(lottoNum);

        System.out.println("생성된 로또 번호: " + lottoNum);
    }
}