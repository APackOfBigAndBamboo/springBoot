package testdemo;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Derscription TODO
 * @auther David
 * @date 2018-11-20 10:45
 * @Version 1.o
 */

public class test {

    public static void main(String[] args) {
        String asa="-1";
        System.out.println(Integer.parseInt(asa));
        // 时间表示格式可以改变，yyyyMMdd需要写例如20160523这种形式的时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        Calendar calendar = Calendar.getInstance();
        System.out.println(sdf.format(calendar.getTime()));
         int d=calendar.get(Calendar.DATE);
         int m=calendar.get(Calendar.MONTH)+1;
         int y=calendar.get(Calendar.YEAR);
        System.out.println(d+""+m+""+y);
        calendar.add(Calendar.MONTH, 2);

        String out = sdf.format(calendar.getTime());
        System.out.println(out);
        calendar.add(Calendar.DATE, 7);
        String qqq = sdf.format(calendar.getTime());
        System.out.println(qqq);
//        SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd");
//        String wednesday;
//        String monday;
//        String sunday;
//        Calendar cal = Calendar.getInstance();
//        cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);//上周日
//        sunday=simpleDateFormat.format(cal.getTime());
//
//        int m = -1;
//        cal.add(Calendar.DATE, m * 7);
//        cal.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
//        wednesday = simpleDateFormat.format(cal.getTime());//上周三
//        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
//        monday=simpleDateFormat.format(cal.getTime());//上周一
//        System.out.println(monday+"++"+wednesday+"++"+sunday);
//        double a=1.0;
//        double b=2.0;
//        if (a<b){
//            System.out.println("asdadasdad");
//        }
////        java.text.SimpleDateFormat sdf= new java.text.SimpleDateFormat("yyyy-MM-dd");
//        Calendar calendar = Calendar.getInstance();
//        String kstemp=calendar.get(Calendar.YEAR)+"-01-01";
//        String jstemp= sdf.format(calendar.getTime());
//        System.out.println(kstemp+jstemp);
//        double a=0.0;
//        String b="0";
//        a+=Double.parseDouble(b);
// System.out.println(GZL.getCount("select b.NAME,a.WORKDATE, p.PROJECTNUM," +
//         "convert((sum(c.COSTTIME)/8),decimal(15,2)) as ts " +
//         "from project_workloadinfo a left join fw_t_ems_user b on a.USERID=b.USER_ID " +
//         "left join project_workitem c on a.WORKLOADID=c.WORKLOADID " +
//         "left join project_inplement p on a.PROJECTID=p.PROJECTID " +
//         "where (a.WORKDATE between '2018-12-10' and '2018-12-16') and a.ISWORKTIME ='0' and c.WORKTYPE='0' and p.PROJECTNUM in ('YJ-GCRJ-2017079','XF-GCJC-2018008','XF-2018056','YJ2016GCJC149','HY-GCZB-2017026','RF-GCRJ-2018016','YJ-QTYW-2017017','YJ2016GCJC111','YJ2016GCJC096','YJ2017GCJC006','YJ2015GCJC109','2012GCJC043','S003','YJ-YFRJ-2017085','KT-GHZX-2018010','XF-JC-2018049','YJ2016GCJC089','YJ2016GCJC025','YJ2015GCJC043','2013GCJC090','2012GCJC052','YJ-GCZB-2018007','AJ-QTZB-2017014','XF-2018055','AJ-GHZX-2018047','RF-GCQT-2018035','YJ-YFRJ-2017001','YJ2013GCJC110','SM-QTQT-2017019','YJ-QTZB-2018076','YJ-GCJC-2017003','S021','YJ2013GCJC116','C015','YJ2015GCJC017','YJ2014GCJC063','YJ2015GCJC134','YJ2016GCJC144','YJ2016GCJC057','YJ2014GCJC070','YJ2016GCJC135','YJ2015GCJC111','YJ2015GCJC127','YJ2015GCJC131','ZD-KTZX-2017002','YJ-GCZB-2017069','YJ2015GCJC009','AJ-KFRJ-2018027','YJ2016GCJC134','AJ-GCRJ-2017004','RF-QTRJ-2017030','AJ-KFRJ-2017029','AJ-GCJC-2017006','YJ-GCJC-2017061','SM-GCJC-2017005','RF-GCRJ-2017022','YJ-GCYW-2017024','HY-YFZB-2017028','YJ-YFRJ-2017092','HY-YFRJ-2017009','ZH2017GCJC005','YJ-GCJC-2017127','SM-GCSJ-2017015','YJ-GCZB-2017065','AJ-GCZB-2017026','YJ-GCYW-2017082','2013GCJC029','YJ2015GCJC114','S029','YJ2016GCJC138','S028','YJ-GCJC-2017012','YJ-GCQT-2017027','SM-GCSJ-2017014','YJ-YFRJ-2017028','YJ-GCRJ-2017037','RF-GCYW-2017045','AJ-KFRJ-2018012','YJ2014GCJC027','YJ2016GCJC080','YJ2014GCJC062','YJ2016GCJC136','YJ2014GCJC082-1','ZD-GHZX-2017006','RF-GCRJ-2017054','HY-QTPX-2017030','YJ-KFRJ-2017120','YJ2017GCJC028','XF-YFRJ-2017015','YJ2015GCJC099','YJ2016GCJC139','2013GCJC087','YJ2016GCJC036','YJ-GCJC-2017005','AJ-QTRJ-2017028','YJ-QTJC-2017081','AJ-GCRJ-2017015','YJ-GCJC-2017059','YJ-YFRJ-2017068','HC-GCRJ-2017013','HY-GCZB-2017002','YJ-QTYW-2017056','RF-QTQT-2017033','SM-GCSJ-2017018','HY2014GCJC007-1','YJ-QTYW-2017034','AJ-KFRJ-2018022','YJ-GCJC-2017030','RF-GCRJ-2017044','SM-GCJC-2017006','YJ-GCYW-2017129','2012GCJC032','YJ2015GCJC007','2013GCJC091','2011GCJC156','YJ2016GCJC034','YJ2016GCJC063','YJ-QTYW-2017086','SM-GHSJ-2018004','RF-QTZB-2017047','RF-GCSJ-2017043','RF-QTQT-2017041','YJ-GCRJ-2017131','AJ-KFRJ-2018013','AJ-QTRJ-2017028-2','YJ-GCJC-2017110','HY-GCRJ-2018031','YJ-GCJC-2017101','YJ-GCJC-2017102','HC-YFRJ-2017017','AJ-KFRJ-2018003','YJ-KFRJ-2018051','RF-GCJC-2018022','YJ-QTYW-2017087','HY-GCRJ-2017017','YJ-QTYW-2017091','YJ-QTYW-2017126','HY2015GCJC016-2','YJ-QTYW-2017034','YJ-GCJC-2017124','HY-QTQT-2017032','2013GCJC001','RF-GCZB-2017058','YJ-GCJC-2017106','RF-QTQT-2017029','HY-YFRJ-2017007','AJ-KFRJ-2017025-2','SM-GCSJ-2017017','2012GCJC078-1','HY-GCZB-2018012','YJ-GCJC-2017111','RF-QTJC-2017051','YJ-GCYW-2017128','YJ-GCYW-2017125','HY-QTRJ-2018029','SM-GCSJ-2017016','HC-YFRJ-2017015','RF-GCRJ-2017021','RF-GCJC-2017008','YJ-GCRJ-2017098','YJ-GCYW-2018067','YJ-GCZB-2018020','HY-KFRJ-2017034','HC-KFRJ-2018021','RF-QTYW-2018006','YJ2016GCJC125-1','RF-GCRJ-2018021','2017XSZS001','YJ-GCJC-2017097','ZH2016GCJC001','YJ-KFRJ-2017115','RF-GCJC-2017056','RF-GCJC-2018027','AJ-KFRJ-2018010','YJ-GCJC-2017105','YJ2015GCJC086','2013GCYW003','YJ2013GCJC127-1','SM-GCZB-2017013','YJ-GCJC-2017044','ZH2015GCJC013','2012GCJC029','AJ-KFRJ-2017025-1','AJ-QTRJ-2017028-1','YJ-QTYW-2017100','RF-YFRJ-2017049','HY2016GCJC020','AJ-KFRJ-2017025','HC-QTYW-2018003','YJ-GCJC-2017103','HY-GCZB-2017033','YJ-GCJC-2017132','ZH2016GCJC006','AJ-QTZX-2018006','YJ-GCRJ-2017079-1','YJ-GHZX-2018039','QT-QTQT-2017012','YJ-GCJC-2017123','YJ-QTYW-2018043','ZD-GHZX-2018005','RF-QTJC-2018024','RF-GCJC-2018029','SM-GCZB-2018013','HY-KFRJ-2018026','YJ-GHSJ-2018061','YJ-GHZX-2018055','XF-GCJC-2018013','HC-KFRJ-2018011','YJ-KFRJ-2018045','YJ-KFRJ-2018024','RF-GCJC-2017003','YJ-KFRJ-2018068','HC-KFRJ-2018025','YJ-GCRJ-2017047','QT-QTRJ-2018009','KT-KFRJ-2018001','SM-QTZX-2018032','HC-KFRJ-2018018','QT-QTQT-2018007','YJ-FWYW-2018078','HY-QTQT-2018033','YJ-QTZB-2018086','YJ2013GCJC115','HY-QTPX-2018028','HY-QTYW-2018023','YJ-QTYW-2018056','XF-KFRJ-2018037','SM-GCZB-2018036','HY-QTZB-2018034','AJ-GCZB-2018053','RF-GCJC-2018032','HY-KFJC-2018013','RF-GHZX-2018014','AJ-GHZX-2018042','AJ-QTRJ-2017028-3','XF-2018043','AJ-QTJC-2018052','SM-GCZB-2018038','YJ2016GCJC150','HY-QTYW-2018030','YJ-KFRJ-2018073','RF-GCQT-2018033','YJ-KFRJ-2018063','YJ-QTYW-2018070','YJ-QTYW-2018044','YJ-FWYW-2018075','AJ-KFRJ-2018039','2012GCJC084','RF-KFRJ-2018037','HY-QTYW-2018014','HC-KFRJ-2018013','HC-KFRJ-2018023','SM-QTYW-2018029','YJ-GHZX-2018058','XF-KFRJ-2018036','YJ2015GCJC090','AJ-GCJC-2017008','AJ-KFRJ-2018038','AJ-GCJC-2017031','SM-GCZB-2018035','2013GCJC029-2','YJ-QTYW-2017017-1','RF-QTQT-2018020','SM-GCRJ-2018002','SM-GCQT-2018033','YJ-QTZB-2018088','YJ-GCJC-2018090') group by p.PROJECTNUM,b.NAME"));//                  //        double a=(double)1;
//        System.out.println(a);
//        System.out.println((double)1/2);
//        Map<String,String> map1 = new HashMap<String, String>();
//        Map<String,String> map2 = new HashMap<String, String>();
//        Map<String,String> map3 = new HashMap<String, String>();
//        Map<String,String> map4= new HashMap<String, String>();
//        map1.put("1", "fds");
//        map2.put("2", "valu");
//        map3.put("133", "fds");
//        map4.put("23", "valu");
//        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        System.out.println(list.size());
//        for(int j=0;j<list.size();j++){
//            if (j==list.size()-1){
//                System.out.println(112);
//            }else {
//                System.out.println(list.get(j).get(list.get(j).keySet()));
//            }
//        }
//        for (Map<String, String> m : list){
//            for (String k : m.keySet()){
//                System.out.println(k + " : " + m.get(k));
//                            }
//
//        }

//        List<String> zt_list=new ArrayList<String>();
//        zt_list.add("实施中");
//        zt_list.add("已完工");
//        zt_list.add("已拿到验收单未完工");
//        zt_list.add("异常");
//        net.sf.json.JSONArray jsonArray=new net.sf.json.JSONArray();
//        net.sf.json.JSONObject sl_obj =new net.sf.json.JSONObject();//存储各状态的项目数量信息
////东部大区、西部大区、南部大区、北部大区、中部大区、消防社会化\国家部委及其他
//        String bg_t="东部大区,西部大区, 南部大区, 北部大区,中部大区,消防社会化,国家部委及其他";
//
//        for(int i=0;i<zt_list.size();i++){
//            sl_obj.put("name",zt_list.get(i).toString());
//            List<Integer> sl_arr = new ArrayList<Integer>();//临时有序存储对应状态、对应的各个bg的数量
//            for(int j=0;j<bg_list.size();j++){
//                List<CCObject> costlist = cs.cqlQuery("xmgljbxx","select case count(*) when 0 then 0 else count(*)  end  y from xmgljbxx where is_deleted='0' and ssqy='"+bg_list.get(j)+"' and xmzt ='"+zt_list.get(i)+"'");
//                if(costlist.size()>0){
//                    sl_arr.add(Integer.parseInt(costlist.get(0).get("y").toString()));
//                    //out.print(costlist+"</br>");
//                }
//            }
//            sl_obj.put("data",sl_arr);
//            jsonArray.add(sl_obj);
//            sl_arr.clear();
//            sl_obj.clear();
//
//        }
    }
}
