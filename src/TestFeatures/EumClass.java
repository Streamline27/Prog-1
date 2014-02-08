package TestFeatures;

/**
 * Created with IntelliJ IDEA.
 * User: java
 * Date: 14.8.2
 * Time: 11:25
 * To change this template use File | Settings | File Templates.
 */
enum EnumClass {
    SMALL("qwrt"), MEDIUM("isfjasdf");

    private String name;

    EnumClass(String s)
    {
        this.name = s;
    }
}
