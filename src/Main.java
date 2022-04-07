import java.util.UUID;

/**
 * @program: DistributedIDDemo
 * @description: 测试类
 * @author: Clover
 * @create: 2022/04/07 15:56
 */
public class Main {
    public static void main(String[] args) {

        /*
         *  构造方法
         *  UUID: 4001bf4a-9847-4d16-b375-123946698a87
         *
         *  first: 4612177820507393302
         *  second: -5515482131441546617
         *
         * */
        /*long a = 4612177820507393302L;
        long b = -5515482131441546617L;
        UUID uuid = new UUID(a, b);
        System.out.println(uuid.toString().equals("4001bf4a-9847-4d16-b375-123946698a87"));*/

        /*
        * V4 随机生成UUID
        * */
        /*UUID uuid = UUID.randomUUID();
        System.out.println(uuid);*/

        /*
        * V3 根据byte[] 生成UUID，byte[]相同，返回相同的UUID
        * */
        /*UUID uuid = UUID.nameUUIDFromBytes(new byte[]{});
        System.out.println(uuid);*/

        /*
        * 根据 8-4-4-4-12 格式字符串生成返回UUID对象
        * */
        /*UUID uuid = UUID.fromString("4001bf4a-9847-4d16-b375-123946698a87");
        System.out.println(uuid);*/

        /*
        * UUID 方法
        * */
        UUID uuid = UUID.randomUUID();
        /*
        * 获取UUID版本号
        * */
        /*int version = uuid.version();
        System.out.println(version);*/

        /*
        * 获取UUID变种号
        * */
        /*int variant = uuid.variant();
        System.out.println(variant);*/

        // 返回时间戳，会抛出异常，只有Time-based UUID也就是版本1或者2的UUID实现才能返回时间戳
        /*uuid.timestamp();*/

        // 返回时钟序列，会抛出异常，只有Time-based UUID也就是版本1或者2的UUID实现才能返回时钟序列
        /*uuid.clockSequence();*/

        // 返回节点ID，会抛出异常，只有Time-based UUID也就是版本1或者2的UUID实现才能返回节点ID
        /*uuid.node();*/

        // 高64位
        /*long mostSignificantBits = uuid.getMostSignificantBits();
        System.out.println(mostSignificantBits);*/
        // 低64位
        /*long leastSignificantBits = uuid.getLeastSignificantBits();
        System.out.println(leastSignificantBits);*/
    }
}
