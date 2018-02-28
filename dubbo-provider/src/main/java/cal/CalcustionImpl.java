package cal;

import org.springframework.stereotype.Service;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/28
 * Time：14:23
 */
@Service
public class CalcustionImpl implements Calcustion {

    public int add(int num1, int num2) {
        return num1+num2;
    }
}
