package homework.shop;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

/*
 * �����ο� �Ұ��� JTable�� ���⿡ ������ �����ʹ� �и����Ѿ�, ���� JTable�� �ٸ� �����͸� ��ü�Ҷ� ���ϴ�..
 * �� ������������ ���̱� ���� JTable�� MVC������ �ݿ��� TableModel�̶�� ��Ʈ�ѷ��� �����Ѵ�!!
 * 
 * */
public class ProductModel extends AbstractTableModel{
	
	//�������迭�� ����Ҽ��� ������, �迭�� ������ ���� ������ �̸� �غ��� �÷��� �����ӟp�� 3���� ���� �� ������ �ִ� List�� �̿��غ���!!
	//ArrayList<Product> ��ü�� �ڷ����̴�...
	//�ѱ����� Ǯ� ���ϸ� �׳� ����Ʈ�� �ƴ϶� Product���� ����Ʈ��
	ArrayList<Product> list = new ArrayList<Product>();
	@Override
	public int getRowCount() {
		
		return list.size(); //���� ���� �� ���ڵ� ����
	}
	@Override
	public int getColumnCount() {
		
		return 5; //�÷��� �� �츮�� ��� 5��
	}
	@Override
	public Object getValueAt(int row, int col) {
		//������ ������ �迭 ��� Product
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
