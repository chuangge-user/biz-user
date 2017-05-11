package com.chuangge.authcenter;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.container.spring.SpringContainer;

/*
 * Copyright (C), 2012-2014, 上海好屋网信息技术有限公司
 * Author:   国楠
 * Date:     14-10-23
 * Description: dubbo 启动
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 国楠          14-10-23           00000001         创建文件
 *
 */
public class Start {

    private static final Logger logger = LoggerFactory.getLogger(Start.class);
    public static void main(String ... args){
    	System.out.println("1232123");
    	for (int i = 0; i < 100; i++) {
    		logger.info("123123");	
		}
    	
    	init1(args);
    }

    /**
     * dubbo 默认的启动方式(更改启动的默认配置目录)
     * @param args
     */
    public static void init1(String ... args){
        //命令行方式 设置dubbo spring 方式的启动默认配置目录,并启动
        //-Ddubbo.spring.config=classpath:config/application-*.xml -Djava.ext.dirs=./lib com.alibaba.dubbo.container.Start

        //代码更改 dubbo spring方式启动的默认配置目录
        String DEFAULT_SPRING_CONFIG = "classpath*:spring-config/applicationContext-*.xml";
        System.setProperty(SpringContainer.SPRING_CONFIG, DEFAULT_SPRING_CONFIG);
        com.alibaba.dubbo.container.Main.main(args);
    }


    private static volatile boolean running = true;
    /**
     * 启动方式 1 使用 spring 启动 dubbo
     */
    public static void init2(String ... args){
        try {
            String [] configs = new String[]{
                    "classpath:spring-config/applicationContext-common.xml"
            };
            final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(configs);

            context.start();
            logger.info("run dubbo serivce.");




            Runtime.getRuntime().addShutdownHook(new Thread() {
                public void run() {
                    try {
                        System.err.println("---------------");
                        context.stop();
                        logger.info("Dubbo  stopped!");
                    } catch (Throwable t) {
                        logger.error(t.getMessage(), t);
                    }
                    synchronized (Start.class) {
                        running = false;
                        Start.class.notify();
                    }
                }
            });

            System.out.println(new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss]").format(new Date()) + " Dubbo app.service server started!");
        } catch (RuntimeException e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);
            System.exit(1);
        }
        synchronized (Start.class) {
            while (running) {
                try {
                    Start.class.wait();
                } catch (Throwable e) {
                }
            }
        }
    }
}
