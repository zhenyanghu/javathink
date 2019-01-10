package xml;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rocky on 2017/12/13.
 */
public class JDOMTest {
    private static List<Book> booksList = new ArrayList<>();

    public static void main(String[] args) {
        // 进行对books.xml文件的JDOM解析
        // 准备工作
        // 1.创建一个SAXBuilder的对象
        SAXBuilder saxBuilder = new SAXBuilder();
        InputStream in;
        // 2.创建一个输入流，将xml文件加载到输入流中
        try {
            in = new FileInputStream("config/book.xml");
            InputStreamReader isr = new InputStreamReader(in, "UTF-8");
            // 3.通过saxBuilder的build方法，将输入流加载到saxBuilder中
            Document document = saxBuilder.build(isr);
            //通过document对象获取xml文件的根节点
            Element rootElement = document.getRootElement();
            //获取根节点下的子节点的List集合
            List<Element> bookList = rootElement.getChildren();
            //继续进行解析
            for (Element book : bookList) {
                Book bookEntity = new Book();
                System.out.println("======开始解析第" + (bookList.indexOf(book) + 1) + "书======");//这不就相当于传统的for循环中的i吗
                // 解析book的属性集合
                List<Attribute> attrList = book.getAttributes();
                for (Attribute attr : attrList) {
                    //获取属性名
                    String attrName = attr.getName();
                    //获取属性值
                    String attrValue = attr.getValue();
                    System.out.println("属性名：" + attrName + "----属性值：" + attrValue);
                    if (attrName.equals("id")) {
                        bookEntity.setId(attrValue);
                    }
                }
                // 对book节点的子节点的节点名以及节点值的遍历
                List<Element> bookChilds = book.getChildren();
                for (Element child : bookChilds) {
                    System.out.println("节点名：" + child.getName() + "----节点值：" + child.getValue());
                    if (child.getName().equals("name")) {
                        bookEntity.setName(child.getValue());
                    }
                    else if (child.getName().equals("author")) {
                        bookEntity.setAuthor(child.getValue());
                    }
                    else if (child.getName().equals("year")) {
                        bookEntity.setYear(child.getValue());
                    }
                    else if (child.getName().equals("price")) {
                        bookEntity.setPrice(child.getValue());
                    }
                    else if (child.getName().equals("language")) {
                        bookEntity.setLanguage(child.getValue());
                    }
                }
                System.out.println("======结束解析第" + (bookList.indexOf(book) + 1) + "书======");
                booksList.add(bookEntity);
                bookEntity = null;
                System.out.println(booksList.size());
                System.out.println(booksList.get(0).getId());
                System.out.println(booksList.get(0).getName());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
