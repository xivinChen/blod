package com.blod.utils;

import java.io.Serializable;
import java.util.List;

public class PageData implements Serializable{
	
	private Long total;
	
	private List list;
	
	private Integer page;
	
	private Integer rows;
	
	private Integer pagetotal;
	
	public Integer getPagetotal() {
		return pagetotal;
	}

	public void setPagetotal() {

		//计算总页数
				this.pagetotal=(int) ((this.total+this.rows-1)/this.rows);

	}

	

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}
	
	

}
