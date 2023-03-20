package tca.model;

import java.util.List;

public class BootstrapTableData<T> {
	
	private long total;
	
	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public long getTotalNotFiltered() {
		return totalNotFiltered;
	}

	public void setTotalNotFiltered(long totalNotFiltered) {
		this.totalNotFiltered = totalNotFiltered;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	private long totalNotFiltered;
	
	private List<T> rows;
	
}
