package enumStudy;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/6
 * Time：14:47
 */
public enum Colors {
    RED("红色"),BLUE("蓝色"),GREEN("绿色");

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Colors(String name) {
        this.name = name;
    }
}
