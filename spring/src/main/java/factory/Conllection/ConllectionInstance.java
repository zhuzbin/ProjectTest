package factory.Conllection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/26
 * Time：14:34
 */
public class ConllectionInstance {

    private List<Object> lists;

    private Set<Object> sets;

    private Map<Object,Object> maps;

    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Set<Object> getSets() {
        return sets;
    }

    public void setSets(Set<Object> sets) {
        this.sets = sets;
    }

    public Map<Object, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<Object, Object> maps) {
        this.maps = maps;
    }

    @Override
    public String toString() {
        return "ConllectionInstance{" +
                "lists=" + lists +
                ", sets=" + sets +
                ", maps=" + maps +
                ", properties=" + properties +
                '}';
    }
}
