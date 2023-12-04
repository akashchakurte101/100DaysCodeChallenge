//package CollectionExaples;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//public class IterationRamoveMethod {
//
//    // Here i,m removing a object from list(Or any collection) while iteration over any collection by using collection remove
//    //    then i should get ConcerrentModificationException
//
//    public static void main(String[] args) {
//
//        List  markets=new ArrayList();
//
//        StockExchange NSE=new StockExchange() {
//            @Override
//            public boolean IstClosed() {
//                return true;
//            }
//        };
//
//       StockExchange  BSE=new StockExchange() {
//
//
//           @Override
//           public boolean IstClosed() {
//               return true;
//           }
//       };
//
//       StockExchange  USA=new StockExchange() {
//           @Override
//           public boolean IstClosed() {
//               return false;
//           }
//       };
//
//        markets.add(NSE);
//        markets.add(BSE);
//        markets.add(USA);
//
//      //  markets.remove(NSE);
//        Iterator itr= markets.iterator();
//
//       while(itr.hasNext())
//       {
//          // markets exchange= itr.next();
//         //  System.out.println(exchange);
//          if(exchange.IstClosed())
//          {
//              itr.remove();
//           //  markets.remove(exchange);
//          }
//       }
//
//       //How to print elements from it
//        System.out.println(markets);
//    }
//
//
//}
//
//interface  StockExchange
//{
//    public boolean IstClosed();
//}