package com.logan.base.utils;

/**
 * Desc：IPUtil
 * Created by liugenxing on 2021/8/19 17:32.
 * Copr：© 2021 Logan.All rights reserved.
 */
public class IPUtil {
    /**
     * Desc: 把字符串IP转换成long
     * Created by liugenxing on 2021/8/19 17:32
     * @param ip
     * @return java.lang.Long
     */
    public static long ipToLong(String ip){
        String[] ipSplit = ip.split("\\.");
        return (Long.parseLong(ipSplit[0]) << 24) + (Long.parseLong(ipSplit[1]) << 16)
                + (Long.parseLong(ipSplit[2]) << 8) + Long.parseLong(ipSplit[3]);
    }

    public static String longToIp(long ip) {
        StringBuilder ipStr = new StringBuilder();
        ipStr.append(ip >>> 24).append(".");
        ipStr.append((ip >>> 16) & 0xFF).append(".");
        ipStr.append((ip >>> 8) & 0xFF).append(".");
        ipStr.append(ip & 0xFF);
        return ipStr.toString();
    }

    public static void main(String[] args) {
        System.out.println(ipToLong("192.168.0.1"));
        System.out.println(longToIp(3232235521L));
        System.out.println(ipToLong("10.0.0.1"));
    }
}
