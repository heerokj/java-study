package day14;
//��� �ڷ����� ���ؼ� ó��
//���� �ڷ����� �������� ���� �̿ϼ� �ڷ������� ����


// Generic : ������ ���Ŀ� �������� �ʰ� �ϳ��� ����
//���� �ٸ� ������ Ÿ�Ե��� ���� �� �ִ� ����� ������ �ξ�
//������ ���� �� �ִ� ���α׷��ֹ��
public class GenEx<T> {
	T[] array;

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public void print() {
		for (T x : array) {
			System.out.println(x);
		}
	}

}
