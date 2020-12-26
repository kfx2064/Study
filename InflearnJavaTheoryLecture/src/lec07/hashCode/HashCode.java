package lec07.hashCode;

import lec07.collectionmap01.map01.MapClass;

public class HashCode {

    public static void main(String[] args) {

        SampleHash sampleHash1 = new SampleHash();
        SampleHash sampleHash2 = new SampleHash();

        System.out.println(sampleHash1.hashCode());
        System.out.println(sampleHash2.hashCode());

        System.out.println("안에 데이터");
        System.out.println(sampleHash1.name.hashCode());
        System.out.println(sampleHash2.name.hashCode());

        System.out.println("다른 데이터로 변환");
        sampleHash2.name = "한국가스";
        System.out.println(sampleHash1.name.hashCode());
        System.out.println(sampleHash2.name.hashCode());

        System.out.println("똑같은 한국가스공사");
        sampleHash1.name = "한국가스";
        System.out.println(sampleHash1.name.hashCode());
        System.out.println(sampleHash2.name.hashCode());

        /*String a1 = "초콜렛";
        String b1 = "초콜렛";

        System.out.println(a1.hashCode());
        System.out.println(b1.hashCode());
        
        String aa1 = "한국";
        String bb1 = "한국";

        System.out.println("한국 해시코드");
        System.out.println(aa1.hashCode());
        System.out.println(bb1.hashCode());

        System.out.println("맵 클래스의 해시코드");
        HashMap hashMap1 = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        System.out.println(hashMap1.hashCode());
        System.out.println(hashMap2.hashCode());
        System.out.println(hashMap3.hashCode());


        HashMap hashMapA = new HashMap();
        HashMap hashMapB = new HashMap();
        HashMap hashMapC = new HashMap();

        hashMap1.put("전자", "삼성전자");
        hashMapA.put("전자", "삼성전자");
        hashMap2.put("조선", "현대중공업");
        hashMapB.put("조선", "현대중공업");
        hashMap3.put("방산", "한화");
        hashMapC.put("방산", "한화");

        System.out.println("맵 데이터 해시코드");
        System.out.println(hashMap1.hashCode());
        System.out.println(hashMapA.hashCode());
        System.out.println(hashMap2.hashCode());
        System.out.println(hashMapB.hashCode());
        System.out.println(hashMap3.hashCode());
        System.out.println(hashMapC.hashCode());*/

    }

}
