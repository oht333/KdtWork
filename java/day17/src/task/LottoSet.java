package task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//1) Random클래스 이용해서 1부터 45중 임의의 숫자 뽑기
//2) Set<> 객체 생성
//3) while문 사용 1~45중 6개 뽑아서 추가(add), Set은 중복되지 않으니 확인필요없음
//4) ArrayList<>로 객체 생성
//5) Collections.sort 사용해서 정렬


public class LottoSet {
    public static void main(String[] args) {
        // Random 객체 생성
        Random random = new Random();

        Set<Integer> lottoNum = new HashSet<>();

        while (lottoNum.size() < 6) {
            int num = random.nextInt(45) + 1; 
            lottoNum.add(num); 
        }

        ArrayList<Integer> sortedLottoNum = new ArrayList<>(lottoNum);

        // List 정렬
        Collections.sort(sortedLottoNum);

        // 결과 출력
        System.out.println("생성된 로또 번호: " + sortedLottoNum);
    }
}
