package com.jdbc.connection.listener;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;

public class MyListener implements RowSetListener {

	@Override
	public void rowSetChanged(RowSetEvent event) {
		System.out.println("row set change.....");

	}

	@Override
	public void rowChanged(RowSetEvent event) {
		System.out.println("row changed.....");

	}

	@Override
	public void cursorMoved(RowSetEvent event) {
		System.out.println("cursor move.....");
	}

}
