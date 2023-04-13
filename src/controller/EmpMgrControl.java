package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import java.awt.event.MouseEvent;
import view.EmpManager;

public class EmpMgrControl implements MouseListener, ActionListener{
	private EmpManager empManager;
	
	public EmpMgrControl(EmpManager empManager) {
		this.empManager = empManager;
	}
	
	public EmpManager getEmpManager() {
		return empManager;
	}

	public void setEmpManager(EmpManager empManager) {
		this.empManager = empManager;
	}
	
	public void hoverMouse() {
		
	}

	// Method abstract of MouseListener
	// Được gọi khi nút chuột được click (được nhấn và nhả ra)
	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		if(e.getSource() == empManager.getLblIconZoomOut()) {
			empManager.ZoomOutMenu();
		}else if(e.getSource() == empManager.getLblIconZoomIn()){
			empManager.ZoomInMenu();
		}else if(e.getSource() == empManager.getLblTourManager()) {
			empManager.Page_TourManager();
		}else if(e.getSource() == empManager.getLblStaffManager()) {
			empManager.Page_StaffManager();
		}
	}

	// Được gọi khi nút chuột đã được click trên một thành phần
	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		if(e.getSource() == empManager.getLblTourManager()) {
			empManager.getPnlTourManager().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == empManager.getLblCusManager()){
			empManager.getPnlCusManager().setBackground(new Color(187, 222, 251));	
		}else if(e.getSource() == empManager.getLblStaffManager()) {
			empManager.getPnlStaffManager().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == empManager.getLblTicManager()){
			empManager.getPnlTicManager().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == empManager.getLblSerManager()) {
			empManager.getPnlSerManager().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == empManager.getLblHotelManager()){
			empManager.getPnlHotelManager().setBackground(new Color(187, 222, 251));	
		}else if(e.getSource() == empManager.getLblVehManager()) {
			empManager.getPnlVehManager().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == empManager.getLblAccManager()){
			empManager.getPnlAccManager().setBackground(new Color(187, 222, 251));	
		}else if(e.getSource() == empManager.getLblStatisticalManager()) {
			empManager.getPnlStatisticalManager().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == empManager.getLblIconZoomIn()){
			empManager.getPnlZoom().setBackground(new Color(187, 222, 251));	
		}else if(e.getSource() == empManager.getLblIconZoomOut()) {
			empManager.getPnlZoom().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == empManager.getLblIconHome()) {
			empManager.getPnlHome().setBackground(new Color(187, 222, 251));
		}			
	}

	// Được gọi khi nút chuột nhập vào một thành phần
	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		if(e.getSource() == empManager.getLblTourManager()) {
			empManager.getPnlTourManager().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == empManager.getLblCusManager()){
			empManager.getPnlCusManager().setBackground(new Color(144, 202, 249));	
		}else if(e.getSource() == empManager.getLblStaffManager()) {
			empManager.getPnlStaffManager().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == empManager.getLblTicManager()){
			empManager.getPnlTicManager().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == empManager.getLblSerManager()) {
			empManager.getPnlSerManager().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == empManager.getLblHotelManager()){
			empManager.getPnlHotelManager().setBackground(new Color(144, 202, 249));	
		}else if(e.getSource() == empManager.getLblVehManager()) {
			empManager.getPnlVehManager().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == empManager.getLblAccManager()){
			empManager.getPnlAccManager().setBackground(new Color(144, 202, 249));	
		}else if(e.getSource() == empManager.getLblStatisticalManager()) {
			empManager.getPnlStatisticalManager().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == empManager.getLblIconZoomIn()){
			empManager.getPnlZoom().setBackground(new Color(144, 202, 249));	
		}else if(e.getSource() == empManager.getLblIconZoomOut()) {
			empManager.getPnlZoom().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == empManager.getLblIconHome()) {
			empManager.getPnlHome().setBackground(new Color(144, 202, 249));
		}		
	}

	// Được gọi khi nút chuột thoát ra khỏi một thành phần
	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		if(e.getSource() == empManager.getLblTourManager()) {
			empManager.getPnlTourManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == empManager.getLblCusManager()){
			empManager.getPnlCusManager().setBackground(new Color(66, 165, 243));	
		}else if(e.getSource() == empManager.getLblStaffManager()) {
			empManager.getPnlStaffManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == empManager.getLblTicManager()){
			empManager.getPnlTicManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == empManager.getLblSerManager()) {
			empManager.getPnlSerManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == empManager.getLblHotelManager()){
			empManager.getPnlHotelManager().setBackground(new Color(66, 165, 243));	
		}else if(e.getSource() == empManager.getLblVehManager()) {
			empManager.getPnlVehManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == empManager.getLblAccManager()){
			empManager.getPnlAccManager().setBackground(new Color(66, 165, 243));	
		}else if(e.getSource() == empManager.getLblStatisticalManager()) {
			empManager.getPnlStatisticalManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == empManager.getLblIconZoomIn()){
			empManager.getPnlZoom().setBackground(new Color(33, 150, 243));	
		}else if(e.getSource() == empManager.getLblIconZoomOut()) {
			empManager.getPnlZoom().setBackground(new Color(33, 150, 243));
		}else if(e.getSource() == empManager.getLblIconHome()) {
			empManager.getPnlHome().setBackground(new Color(33, 150, 243));
		}
	}

	// Được gọi khi nút chuột đã được nhả ra trên một thành phần
	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		if(e.getSource() == empManager.getLblTourManager()) {
			empManager.getPnlTourManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == empManager.getLblCusManager()){
			empManager.getPnlCusManager().setBackground(new Color(66, 165, 243));	
		}else if(e.getSource() == empManager.getLblStaffManager()) {
			empManager.getPnlStaffManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == empManager.getLblTicManager()){
			empManager.getPnlTicManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == empManager.getLblSerManager()) {
			empManager.getPnlSerManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == empManager.getLblHotelManager()){
			empManager.getPnlHotelManager().setBackground(new Color(66, 165, 243));	
		}else if(e.getSource() == empManager.getLblVehManager()) {
			empManager.getPnlVehManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == empManager.getLblAccManager()){
			empManager.getPnlAccManager().setBackground(new Color(66, 165, 243));	
		}else if(e.getSource() == empManager.getLblStatisticalManager()) {
			empManager.getPnlStatisticalManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == empManager.getLblIconZoomIn()){
			empManager.getPnlZoom().setBackground(new Color(33, 150, 243));	
		}else if(e.getSource() == empManager.getLblIconZoomOut()) {
			empManager.getPnlZoom().setBackground(new Color(33, 150, 243));
		}else if(e.getSource() == empManager.getLblIconHome()) {
			empManager.getPnlHome().setBackground(new Color(33, 150, 243));
		}		
	}
	
	
	// Method abstract of ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
}
