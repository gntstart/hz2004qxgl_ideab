package com.gnt.qxgl.base.encoders;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.*;

/**
 * <功能概述>
 *
 * @author: 杨冬冬
 * @className: PdfBase64
 * @package: com.gnt.qxgl.base.encoders
 * @description: 介绍
 * @date: 2020-07-14 16:42
 */
public class PdfBase64 {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\Desktop\\hz\\zjm.jpg");
        String base64 = PDFToBase64(file);
        System.out.println(base64);
        base64StringToPdf(base64,"C:\\Users\\Administrator\\Desktop\\hz\\base64.pdf");
    }

    /**
     * Description: 将base64编码内容转换为Pdf
     *
     * @param base64Content，文件的存储路径（含文件名）
     * @param filePath                    存储路径
     * @Author 杨冬冬
     * Create Date: 2015年7月30日 上午9:40:23
     */
    public static void base64StringToPdf(String base64Content, String filePath) {
        BASE64Decoder decoder = new BASE64Decoder();
        BufferedInputStream bis = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        try {
            //base64编码内容转换为字节数组
            byte[] bytes = decoder.decodeBuffer(base64Content);
            ByteArrayInputStream byteInputStream = new ByteArrayInputStream(bytes);
            bis = new BufferedInputStream(byteInputStream);
            File file = new File(filePath);
            File path = file.getParentFile();
            if (!path.exists()) {
                path.mkdirs();
            }
            fos = new FileOutputStream(file);
            bos = new BufferedOutputStream(fos);

            byte[] buffer = new byte[1024];
            int length = bis.read(buffer);
            while (length != -1) {
                bos.write(buffer, 0, length);
                length = bis.read(buffer);
            }
            bos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bis.close();
                fos.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Description: 将pdf文件转换为Base64编码
     *
     * @param file 要转的的pdf文件
     * @Author 杨冬冬
     * Create Date: 2015年8月3日 下午9:52:30
     */
    public static String PDFToBase64(File file) {
        BASE64Encoder encoder = new BASE64Encoder();
        FileInputStream fin = null;
        BufferedInputStream bin = null;
        ByteArrayOutputStream baos = null;
        BufferedOutputStream bout = null;
        try {
            fin = new FileInputStream(file);
            bin = new BufferedInputStream(fin);
            baos = new ByteArrayOutputStream();
            bout = new BufferedOutputStream(baos);
            byte[] buffer = new byte[1024];
            int len = bin.read(buffer);
            while (len != -1) {
                bout.write(buffer, 0, len);
                len = bin.read(buffer);
            }
            //刷新此输出流并强制写出所有缓冲的输出字节
            bout.flush();
            byte[] bytes = baos.toByteArray();

            return encoder.encodeBuffer(bytes).trim();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fin.close();
                bin.close();
                bout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
