package homework.shop;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

/*
 * 디자인에 불과한 JTable과 여기에 보여질 데이터는 분리시켜야, 추후 JTable에 다른 데이터를 교체할때 편하다..
 * 즉 유지보수성을 높이기 위해 JTable은 MVC패턴을 반영한 TableModel이라는 컨트롤러를 제공한다!!
 * 
 * */
public class ProductModel extends AbstractTableModel{
	
	//이차원배열을 사용할수도 있으나, 배열의 단점이 많기 때문에 이를 극복한 컬렉션 프레임웤의 3가지 유형 중 순서가 있는 List를 이용해본다!!
	//ArrayList<Product> 자체가 자료형이다...
	//한국말로 풀어서 말하면 그냥 리스트가 아니라 Product전용 리스트형
	ArrayList<Product> list = new ArrayList<Product>();
	@Override
	public int getRowCount() {
		
		return list.size(); //행의 갯수 즉 레코드 갯수
	}
	@Override
	public int getColumnCount() {
		
		return 5; //컬럼의 수 우리의 경우 5개
	}
	@Override
	public Object getValueAt(int row, int col) {
		//기존의 일차원 배열 대신 Product
		Product product = list.get(row);
		String data=null;
		if(col==0) {
			data=Integer.toString(product.getProduct_id());
		}else if(col==1) {
			data=product.getName();
		}else if(col==2) {
			data=Integer.toString(product.getPrice());
		}else if(col==3) {
			data=product.getBrand();
		}else if(col==4) {
			data=product.getImg();
		}
		return data;
	}
}
