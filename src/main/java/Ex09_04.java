public class Ex09_04 {

        public static void main(String[] args) {

            String str = "Java를 공부하는 중, Java는 재밌어요.^^";

            System.out.println("문자열 ==>" + str);

            System.out.print("제일 처음 나온 Java 위치 ==> ");
            System.out.println(str.indexOf("Java"));

            System.out.print("마지막에 나온 Java 위치 ==> ");
            System.out.println(str.lastIndexOf("Java"));

// Access_log 서버 로그 샘플
            String log = "111.222.33.44 - - [11/Jun/2012:22:12:32 +0900] \"GET /w/custom/jmnote20120124.ico HTTP/1.1\" 304 - \"-\" \"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; MS-RTC LM 8)\"";

            if (log.startsWith("111.222")) {

                int ipLastPos = log.indexOf(" ");
                System.out.println("ipLastPos : " + ipLastPos);
                System.out.println("IP : "+ log.substring(0, ipLastPos));

// System.out.println("111.222로 시작하는 IP가 호출한 로그입니다.");
            }


        }
    }

