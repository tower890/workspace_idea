package bo;

/*这是测试*/
public class HelloWorld {

    public String getResult(String name) {
        String ret = "hello,这是测试 " + name;
        System.out.println("测试");
        System.out.println("xx");

        return ret;
    }

    public CImsi getImsiUser(String imsi) {
        CImsi cImsi = new CImsi();
        cImsi.getImsi();
        CPublicUser cPublicUser = new CPublicUser();
        cPublicUser.setUsername("zgx");
        return cImsi;
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        String x = helloWorld.getResult("wo是谁");
        System.out.println(x);
        CImsi cImsi = helloWorld.getImsiUser("my");
        System.out.println(cImsi);


    }


}
