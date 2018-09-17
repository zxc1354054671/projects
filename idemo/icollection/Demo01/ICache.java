package Demo01;

import com.whalin.MemCached.MemCachedClient;
import com.whalin.MemCached.SockIOPool;

public class ICache {
	public static MemCachedClient client=null;
	public static String[] connUrls={"127.0.0.1:11211"};
	//初始化连接
	static{
		String[] attr=connUrls;
		client=new MemCachedClient();
		SockIOPool pool = SockIOPool.getInstance();
		pool.setServers(attr);
		pool.setWeights(new Integer[]{3});
		pool.setInitConn(5);
		pool.setMinConn(5);
		pool.setMaxConn(100);
		pool.setMaxIdle(1000*30*30);
		pool.setMaintSleep(30);
		pool.setNagle(false);
		pool.setSocketConnectTO(30);
		pool.initialize();
	}
	//添加数据
    public static void add(String key, Object object) {
        System.out.println(client.set(key, object));
    }
    //删除数据
    public static void del(String key) {
        client.delete(key);
    }
    //获得数据
    public static Object get(String key) {
        return client.get(key);
    }
}
