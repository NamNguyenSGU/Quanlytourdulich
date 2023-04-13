package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.MouseListener;
import controller.EmpMgrControl;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class EmpManager extends JFrame {
	
	private BorderLayout borderLayout;
	private JPanel pnlHeader;
	private JLabel lblHeaderTitle;
	private JPanel pnlMenu;
	private JPanel pnlMenuTools;
	private JLabel lblIconZoomOut;
	private JLabel lblIconZoomIn;
	private JPanel pnlMenuDetail;
	private JPanel pnlLogo;
	private JPanel pnlMngList;
	private JPanel pnlLeft;
	private JPanel pnlRight;
	private JPanel pnlBottom;
	private JLabel lblTourManager;
	private JLabel lblCusManager;
	private JLabel lblStaffManager;
	private JLabel lblTicManager;
	private JLabel lblSerManager;
	private JLabel lblHotelManager;
	private JLabel lblVehManager;
	private JLabel lblAccManager;
	private JPanel pnlZoom;
	private JPanel pnlSetting;
	private JPanel pnlTourManager;
	private JPanel pnlCusManager;
	private JPanel pnlStaffManager;
	private JPanel pnlTicManager;
	private JPanel pnlSerManager;
	private JPanel pnlHotelManager;
	private JPanel pnlVehManager;
	private JPanel pnlAccManager;
	private JPanel pnlStatisticalManager;
	private JLabel lblIconSetting;
	private JPanel pnlStaffList;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JTextField txtDay;
	private JRadioButton rdbtnEmployee;
	private JRadioButton rdbtnManager;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private JTextField txtMonth;
	private JTextField txtYear;
	private ButtonGroup bgEmpGen;
	private ButtonGroup bgEmpRole;
	private JList listStaff;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblFomatAge;
	private JPanel pnlHome;
	private JLabel lblIconHome;
	private JLabel lblStatisticalManager;
	private JPanel pnlNumOfDay;
	private JLabel lblNumOfDay;
	private JPanel pnlNumOfPeople;
	private JLabel lblNumOfPeople;
	private JPanel pnlTourList;
	private JList listTour;
	private JComboBox cbBoxArea;
	private JComboBox cbBoxNumOfDay;
	private JComboBox cbBoxNumOfPeople;
	private JScrollPane scrollMenuDeTail;
	private JPanel pnlListDetail;
	private JPanel pnlContentTour;
	private JPanel pnlContentTitleTour;
	private JLabel lblContentTitleTour;
	private JPanel pnlSearchTour;
	private JLabel lblSearchTour;
	private JTextField txtSearchTour;
	private JPanel pnlContentTourDetail;
	private JPanel pnlEditAndListTour;
	private JPanel pnlEditTour;
	private JScrollPane scrollFillInforTour;
	private JPanel pnlFillTour;
	private JPanel pnlIdTour;
	private JLabel lblIdTour;
	private JTextField txtIdTour;
	private JPanel pnlNameTour;
	private JLabel lblNameTour;
	private JTextField txtNameTour;
	private JPanel pnlAreaTour;
	private JLabel lblAreaTour;
	private JPanel pnlButtonTour;
	private JButton btnAddTour;
	private JPanel pnlContentStaff;
	private JPanel pnlContentTitleStaff;
	private JLabel lblContentTitleStaff;
	private JPanel pnlSearchStaff;
	private JLabel lblSearchStaff;
	private JTextField txtSearchStaff;
	private JPanel pnlContentStaffDetail;
	private JPanel pnlEditAndListStaff;
	private JPanel pnlEditStaff;
	private JScrollPane scrollFillInforStaff;
	private JPanel pnlFillStaff;
	private JPanel pnlIdStaff;
	private JLabel lblIdStaff;
	private JTextField txtIdStaff;
	private JPanel pnlNameStaff;
	private JLabel lblNameStaff;
	private JTextField txtNameStaff;
	private JPanel pnlRoleStaff;
	private JLabel lblRoleStaff;
	private JPanel pnlGenderStaff;
	private JLabel lblGenderStaff;
	private JPanel pnlAgeStaff;
	private JLabel lblAgeStaff;
	private JPanel pnlAddressStaff;
	private JLabel lblAddressStaff;
	private JTextField txtAddressStaff;
	private JPanel pnlPhoneStaff;
	private JLabel lblPhoneStaff;
	private JTextField txtPhoneStaff;
	private JPanel pnlEmailStaff;
	private JPanel pnlAddStaff;
	private JLabel lblEmailStaff;
	private JTextField txtEmailStaff;
	private JButton btnAddStaff;

	
	public EmpManager(JLabel lblIconZoomOut, JLabel lblIconZoomIn, JLabel lblTourManager, JLabel lblCusManager, JLabel lblStaffManager,
			JLabel lblTicManager, JLabel lblSerManager, JLabel lblHotelManager, JLabel lblVehManager, JLabel lblAccManager, JLabel lblStatisticalManager,
			JPanel pnlTourManager, JPanel pnlCusManager, JPanel pnlStaffManager, JPanel pnlTicManager, JPanel pnlSerManager, JPanel pnlHotelManager,
			JPanel pnlVehManager, JPanel pnlAccManager, JPanel pnlStatisticalManager, JPanel pnlZoom, JLabel lblIconHome, JPanel pnlHome) {
		this.lblIconZoomOut = lblIconZoomOut;
		this.lblIconZoomIn = lblIconZoomIn;
		this.lblTourManager = lblTourManager;
		this.lblCusManager = lblCusManager;
		this.lblStaffManager = lblStaffManager;
		this.lblTicManager = lblTicManager;
		this.lblSerManager = lblSerManager;
		this.lblHotelManager = lblHotelManager;
		this.lblVehManager = lblVehManager;
		this.lblAccManager = lblAccManager;
		this.lblStatisticalManager = lblStatisticalManager;	
		this.pnlTourManager = pnlTourManager;
		this.pnlCusManager = pnlCusManager;
		this.pnlStaffManager = pnlStaffManager;
		this.pnlTicManager = pnlTicManager;		
		this.pnlSerManager = pnlSerManager;	
		this.pnlHotelManager = pnlHotelManager;
		this.pnlVehManager = pnlVehManager;
		this.pnlAccManager = pnlAccManager;
		this.pnlStatisticalManager = pnlStatisticalManager;
		this.pnlZoom = pnlZoom;
		this.lblIconHome = lblIconHome;
		this.pnlHome = pnlHome;
	}
	
	public JLabel getLblIconZoomOut() {
		return lblIconZoomOut;
	}

	public void setLblIconZoomOut(JLabel lblIconZoomOut) {
		this.lblIconZoomOut = lblIconZoomOut;
	}

	public JLabel getLblIconZoomIn() {
		return lblIconZoomIn;
	}

	public void setLblIconZoomIn(JLabel lblIconZoomIn) {
		this.lblIconZoomIn = lblIconZoomIn;
	}
	
	public JLabel getLblTourManager() {
		return lblTourManager;
	}

	public void setLblTourManager(JLabel lblTourManager) {
		this.lblTourManager = lblTourManager;
	}

	public JLabel getLblCusManager() {
		return lblCusManager;
	}

	public void setLblCusManager(JLabel lblCusManager) {
		this.lblCusManager = lblCusManager;
	}

	public JLabel getLblStaffManager() {
		return lblStaffManager;
	}

	public void setLblStaffManager(JLabel lblStaffManager) {
		this.lblStaffManager = lblStaffManager;
	}

	public JLabel getLblTicManager() {
		return lblTicManager;
	}

	public void setLblTicManager(JLabel lblTicManager) {
		this.lblTicManager = lblTicManager;
	}

	public JLabel getLblSerManager() {
		return lblSerManager;
	}

	public void setLblSerManager(JLabel lblSerManager) {
		this.lblSerManager = lblSerManager;
	}

	public JLabel getLblHotelManager() {
		return lblHotelManager;
	}

	public void setLblHotelManager(JLabel lblHotelManager) {
		this.lblHotelManager = lblHotelManager;
	}

	public JLabel getLblVehManager() {
		return lblVehManager;
	}

	public void setLblVehManager(JLabel lblVehManager) {
		this.lblVehManager = lblVehManager;
	}

	public JLabel getLblAccManager() {
		return lblAccManager;
	}

	public void setLblAccManager(JLabel lblAccManager) {
		this.lblAccManager = lblAccManager;
	}

	public JLabel getLblStatisticalManager() {
		return lblStatisticalManager;
	}

	public void setLblStatisticalManager(JLabel lblStatisticalManager) {
		this.lblStatisticalManager = lblStatisticalManager;
	}
	
	public JPanel getPnlTourManager() {
		return pnlTourManager;
	}

	public void setPnlTourManager(JPanel pnlTourManager) {
		this.pnlTourManager = pnlTourManager;
	}

	public JPanel getPnlCusManager() {
		return pnlCusManager;
	}

	public void setPnlCusManager(JPanel pnlCusManager) {
		this.pnlCusManager = pnlCusManager;
	}

	public JPanel getPnlStaffManager() {
		return pnlStaffManager;
	}

	public void setPnlStaffManager(JPanel pnlStaffManager) {
		this.pnlStaffManager = pnlStaffManager;
	}

	public JPanel getPnlTicManager() {
		return pnlTicManager;
	}

	public void setPnlTicManager(JPanel pnlTicManager) {
		this.pnlTicManager = pnlTicManager;
	}

	public JPanel getPnlSerManager() {
		return pnlSerManager;
	}

	public void setPnlSerManager(JPanel pnlSerManager) {
		this.pnlSerManager = pnlSerManager;
	}

	public JPanel getPnlHotelManager() {
		return pnlHotelManager;
	}

	public void setPnlHotelManager(JPanel pnlHotelManager) {
		this.pnlHotelManager = pnlHotelManager;
	}

	public JPanel getPnlVehManager() {
		return pnlVehManager;
	}

	public void setPnlVehManager(JPanel pnlVehManager) {
		this.pnlVehManager = pnlVehManager;
	}

	public JPanel getPnlAccManager() {
		return pnlAccManager;
	}

	public void setPnlAccManager(JPanel pnlAccManager) {
		this.pnlAccManager = pnlAccManager;
	}

	public JPanel getPnlStatisticalManager() {
		return pnlStatisticalManager;
	}

	public void setPnlStatisticalManager(JPanel pnlStatisticalManager) {
		this.pnlStatisticalManager = pnlStatisticalManager;
	}
	
	public JPanel getPnlZoom() {
		return pnlZoom;
	}

	public void setPnlZoom(JPanel pnlZoom) {
		this.pnlZoom = pnlZoom;
	}
	
	public JLabel getLblIconHome() {
		return lblIconHome;
	}

	public void setLblIconHome(JLabel lblIconHome) {
		this.lblIconHome = lblIconHome;
	}

	public JPanel getPnlHome() {
		return pnlHome;
	}

	public void setPnlHome(JPanel pnlHome) {
		this.pnlHome = pnlHome;
	}

	public EmpManager() {
//		EmpMgrModel empManagerModel = new EmpMgrModel();
		init();
	}
	
	public void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 700);
		setLocationRelativeTo(null);
		
		// Event
		MouseListener mouseListener1 = new EmpMgrControl(this);
		
		borderLayout = new BorderLayout();	
		getContentPane().setLayout(borderLayout);
		
		// Create header at NORTH
		pnlHeader = new JPanel();
		pnlHeader.setBackground(new Color(33, 150, 243));
		getContentPane().add(pnlHeader, BorderLayout.NORTH);
		pnlHeader.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
		
		// Create title into pnlHeader
		lblHeaderTitle = new JLabel("Quản Lí Tour Du Lịch");
		lblHeaderTitle.setFont(new Font("Tahoma", Font.BOLD, 24));
		pnlHeader.add(lblHeaderTitle);
		
		// Create pnlMenu at WEST
		pnlMenu= new JPanel();
		getContentPane().add(pnlMenu, BorderLayout.WEST);
		pnlMenu.setLayout(new BorderLayout());
		
		// Create pnlMenuZoom into pnlMenu
		pnlMenuTools = new JPanel();
		pnlMenuTools.setBackground(new Color(33, 150, 243));
		pnlMenuTools.setAlignmentX(Component.LEFT_ALIGNMENT);
		pnlMenuTools.setPreferredSize(new Dimension(50, 10));
		pnlMenu.add(pnlMenuTools, BorderLayout.WEST);
		pnlMenuTools.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		pnlZoom = new JPanel();
		pnlZoom.setBackground(new Color(33, 150, 243));
		pnlZoom.setPreferredSize(new Dimension(50, 33));
		pnlZoom.setLayout(null);
		pnlMenuTools.add(pnlZoom);
		
		pnlHome = new JPanel();
		pnlHome.setBackground(new Color(33, 150, 243));
		pnlHome.setPreferredSize(new Dimension(50, 33));
		pnlMenuTools.add(pnlHome);
		
		pnlSetting = new JPanel();
		pnlSetting.setBackground(new Color(33, 150, 243));
		pnlSetting.setPreferredSize(new Dimension(50, 33));
		pnlMenuTools.add(pnlSetting);
		pnlSetting.setLayout(null);
			
		// Create lblIconZoom into pnlMenuZoom
		lblIconZoomOut = new JLabel("", JLabel.CENTER);
		lblIconZoomOut.setBounds(0, 0, 50, 33);
		lblIconZoomOut.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(EmpManager.class.getResource("zoomout.png"))));
		lblIconZoomOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblIconZoomOut.addMouseListener(mouseListener1);
		pnlZoom.add(lblIconZoomOut);
		
		lblIconHome = new JLabel("", JLabel.CENTER);
		lblIconHome.setBounds(0, 0, 50, 33);
		lblIconHome.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(EmpManager.class.getResource("home.png"))));
		lblIconHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblIconHome.addMouseListener(mouseListener1);
		pnlHome.add(lblIconHome);
		
		lblIconSetting = new JLabel("", JLabel.CENTER);
		lblIconSetting.setBounds(0, 0, 50, 33);
		lblIconSetting.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(EmpManager.class.getResource("settings.png"))));
		lblIconSetting.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblIconSetting.addMouseListener(mouseListener1);
		pnlSetting.add(lblIconSetting);
		
		// Create pnlMenuDetail into pnlMenu
		pnlMenuDetail = new JPanel();
		pnlMenuDetail.setBackground(new Color(255, 255, 255));
		pnlMenuDetail.setAlignmentX(Component.LEFT_ALIGNMENT);
		pnlMenuDetail.setPreferredSize(new Dimension(222, 10));
		pnlMenu.add(pnlMenuDetail, BorderLayout.EAST);
		pnlMenuDetail.setLayout(new BorderLayout());
		
		pnlLogo = new JPanel();
		pnlLogo.setBackground(new Color(66, 165, 243));
		pnlLogo.setPreferredSize(new Dimension(10, 150));
		pnlMenuDetail.add(pnlLogo, BorderLayout.NORTH);
		
		
		pnlMngList = new JPanel();
		pnlMngList.setAutoscrolls(true);
		pnlMngList.setBackground(new Color(255, 255, 255));
		pnlMenuDetail.add(pnlMngList, BorderLayout.CENTER);
		pnlMngList.setLayout(new BorderLayout(0, 0));
		
		pnlLeft = new JPanel();
		pnlLeft.setBackground(new Color(66, 165, 243));
		pnlLeft.setPreferredSize(new Dimension(25, 10));
		pnlMngList.add(pnlLeft, BorderLayout.WEST);
		
		pnlRight = new JPanel();
		pnlRight.setBackground(new Color(66, 165, 243));
		pnlRight.setPreferredSize(new Dimension(25, 10));
		pnlMngList.add(pnlRight, BorderLayout.EAST);
		
		pnlBottom = new JPanel();
		pnlBottom.setBackground(new Color(66, 165, 243));
		pnlBottom.setPreferredSize(new Dimension(10, 60));
		pnlMngList.add(pnlBottom, BorderLayout.SOUTH);
		
		scrollMenuDeTail = new JScrollPane();
		scrollMenuDeTail.setBorder(null);
		pnlMngList.add(scrollMenuDeTail, BorderLayout.CENTER);
		
		pnlListDetail = new JPanel();
		pnlListDetail.setAlignmentY(Component.TOP_ALIGNMENT);
		scrollMenuDeTail.setViewportView(pnlListDetail);
		pnlListDetail.setLayout(new GridLayout(9, 1, 0, 0));
	
		pnlTourManager = new JPanel();
		pnlTourManager.setBounds(0, 3, 172, 34);
		pnlTourManager.setBackground(new Color(66, 165, 243));
		pnlListDetail.add(pnlTourManager);
		pnlTourManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlCusManager = new JPanel();
		pnlCusManager.setBounds(0, 3, 172, 34);
		pnlCusManager.setBackground(new Color(66, 165, 243));
		pnlListDetail.add(pnlCusManager);
		pnlCusManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlStaffManager = new JPanel();
		pnlStaffManager.setBounds(0, 3, 172, 34);
		pnlStaffManager.setBackground(new Color(66, 165, 243));
		pnlListDetail.add(pnlStaffManager);
		pnlStaffManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlTicManager = new JPanel();
		pnlTicManager.setBounds(0, 3, 172, 34);
		pnlTicManager.setBackground(new Color(66, 165, 243));
		pnlListDetail.add(pnlTicManager);
		pnlTicManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlSerManager = new JPanel();
		pnlSerManager.setBounds(0, 3, 172, 34);
		pnlSerManager.setBackground(new Color(66, 165, 243));
		pnlListDetail.add(pnlSerManager);
		pnlSerManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlHotelManager = new JPanel();
		pnlHotelManager.setBounds(0, 3, 172, 34);
		pnlHotelManager.setBackground(new Color(66, 165, 243));
		pnlListDetail.add(pnlHotelManager);
		pnlHotelManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlVehManager = new JPanel();
		pnlVehManager.setBounds(0, 3, 172, 34);
		pnlVehManager.setBackground(new Color(66, 165, 243));
		pnlListDetail.add(pnlVehManager);
		pnlVehManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlAccManager = new JPanel();
		pnlAccManager.setBounds(0, 3, 172, 34);
		pnlAccManager.setBackground(new Color(66, 165, 243));
		pnlListDetail.add(pnlAccManager);
		pnlAccManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlStatisticalManager = new JPanel();
		pnlStatisticalManager.setBounds(0, 3, 172, 34);
		pnlStatisticalManager.setBackground(new Color(66, 165, 243));
		pnlListDetail.add(pnlStatisticalManager);
		pnlStatisticalManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		
		// List Management into pnlMngList
		lblTourManager = new JLabel("   Tour Manager");
		lblTourManager.setPreferredSize(new Dimension(76, 40));
		lblTourManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(EmpManager.class.getResource("travel.png"))));
		lblTourManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTourManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlTourManager.add(lblTourManager);
		lblTourManager.addMouseListener(mouseListener1);
		
		lblCusManager = new JLabel("   Customer Manager");
		lblCusManager.setPreferredSize(new Dimension(76, 40));
		lblCusManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(EmpManager.class.getResource("customer.png"))));
		lblCusManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCusManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlCusManager.add(lblCusManager);
		lblCusManager.addMouseListener(mouseListener1);
		
		lblStaffManager = new JLabel("   Staff Manager");
		lblStaffManager.setPreferredSize(new Dimension(76, 40));
		lblStaffManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(EmpManager.class.getResource("staff.png"))));
		lblStaffManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStaffManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlStaffManager.add(lblStaffManager);
		lblStaffManager.addMouseListener(mouseListener1);
		
		lblTicManager = new JLabel("   Ticket Manager");
		lblTicManager.setPreferredSize(new Dimension(76, 40));
		lblTicManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(EmpManager.class.getResource("ticket.png"))));
		lblTicManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTicManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlTicManager.add(lblTicManager);
		lblTicManager.addMouseListener(mouseListener1);
		
		lblSerManager = new JLabel("   Service Manager");
		lblSerManager.setPreferredSize(new Dimension(76, 40));
		lblSerManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(EmpManager.class.getResource("service.png"))));
		lblSerManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSerManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlSerManager.add(lblSerManager);
		lblSerManager.addMouseListener(mouseListener1);
		
		lblHotelManager = new JLabel("   Hotel Manager");
		lblHotelManager.setPreferredSize(new Dimension(76, 40));
		lblHotelManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(EmpManager.class.getResource("hotel.png"))));
		lblHotelManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHotelManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlHotelManager.add(lblHotelManager);
		lblHotelManager.addMouseListener(mouseListener1);
		
		lblVehManager = new JLabel("  Vehicle Manager");
		lblVehManager.setPreferredSize(new Dimension(76, 40));
		lblVehManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(EmpManager.class.getResource("vehicle.png"))));
		lblVehManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVehManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlVehManager.add(lblVehManager);
		lblVehManager.addMouseListener(mouseListener1);
		
		lblAccManager = new JLabel("   Account Manager");
		lblAccManager.setPreferredSize(new Dimension(76, 40));
		lblAccManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(EmpManager.class.getResource("account.png"))));
		lblAccManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAccManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlAccManager.add(lblAccManager);
		lblAccManager.addMouseListener(mouseListener1);
		
		lblStatisticalManager = new JLabel("   Statistical Manager");
		lblStatisticalManager.setPreferredSize(new Dimension(76, 40));
		lblStatisticalManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(EmpManager.class.getResource("statistical.png"))));
		lblStatisticalManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStatisticalManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlStatisticalManager.add(lblStatisticalManager);
		lblStatisticalManager.addMouseListener(mouseListener1);
		
		
		
		// Content of Tour Manager
		pnlContentTour = new JPanel();
		pnlContentTour.setBackground(new Color(255, 255, 255));
		getContentPane().add(pnlContentTour, BorderLayout.CENTER);
		pnlContentTour.setLayout(new BorderLayout(0, 0));
		
		pnlContentTitleTour = new JPanel();
		pnlContentTitleTour.setPreferredSize(new Dimension(10, 100));
		pnlContentTour.add(pnlContentTitleTour, BorderLayout.NORTH);
		pnlContentTitleTour.setLayout(new BorderLayout(0, 0));
		
		lblContentTitleTour = new JLabel("Tour Manager");
		lblContentTitleTour.setPreferredSize(new Dimension(200, 75));
		lblContentTitleTour.setHorizontalAlignment(SwingConstants.CENTER);
		lblContentTitleTour.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		pnlContentTitleTour.add(lblContentTitleTour, BorderLayout.CENTER);
		
		pnlSearchTour = new JPanel();
		pnlSearchTour.setPreferredSize(new Dimension(10, 40));
		pnlContentTitleTour.add(pnlSearchTour, BorderLayout.SOUTH);
		
		lblSearchTour = new JLabel("");
		lblSearchTour.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(EmpManager.class.getResource("search.png"))));
		lblSearchTour.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlSearchTour.add(lblSearchTour);
		
		txtSearchTour = new JTextField();
		txtSearchTour.setPreferredSize(new Dimension(7, 32));
		pnlSearchTour.add(txtSearchTour);
		txtSearchTour.setColumns(40);
		
		pnlContentTourDetail = new JPanel();
		pnlContentTour.add(pnlContentTourDetail, BorderLayout.CENTER);
		pnlContentTourDetail.setLayout(new BorderLayout(0, 0));
		
		pnlEditAndListTour = new JPanel();
		pnlContentTourDetail.add(pnlEditAndListTour, BorderLayout.CENTER);
		pnlEditAndListTour.setLayout(new GridLayout(1, 2, 0, 0));
		
		pnlEditTour = new JPanel();
		pnlEditAndListTour.add(pnlEditTour);
		pnlEditTour.setLayout(new BorderLayout(0, 0));
		
		scrollFillInforTour = new JScrollPane();
		scrollFillInforTour.setBorder(new TitledBorder(null, "Edit Tour", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlEditTour.add(scrollFillInforTour);
		
		pnlFillTour = new JPanel();
		scrollFillInforTour.setViewportView(pnlFillTour);
		pnlFillTour.setLayout(new GridLayout(8, 1, 0, 0));
		
		pnlIdTour = new JPanel();
		pnlIdTour.setPreferredSize(new Dimension(320, 35));
		pnlFillTour.add(pnlIdTour);
		pnlIdTour.setLayout(null);
		
		lblIdTour = new JLabel("ID");
		lblIdTour.setBounds(32, 11, 60, 25);
		lblIdTour.setPreferredSize(new Dimension(60, 25));
		pnlIdTour.add(lblIdTour);
		
		txtIdTour = new JTextField();
		txtIdTour.setBounds(161, 11, 117, 25);
		txtIdTour.setPreferredSize(new Dimension(100, 25));
		pnlIdTour.add(txtIdTour);
		txtIdTour.setColumns(20);
		
		pnlNameTour = new JPanel();
		pnlNameTour.setPreferredSize(new Dimension(320, 35));
		pnlFillTour.add(pnlNameTour);
		pnlNameTour.setLayout(null);
		
		lblNameTour = new JLabel("Name");
		lblNameTour.setBounds(32, 11, 60, 25);
		lblNameTour.setPreferredSize(new Dimension(60, 25));
		pnlNameTour.add(lblNameTour);
		
		txtNameTour = new JTextField();
		txtNameTour.setBounds(161, 11, 159, 25);
		txtNameTour.setPreferredSize(new Dimension(100, 25));
		txtNameTour.setColumns(20);
		pnlNameTour.add(txtNameTour);
		
		pnlAreaTour = new JPanel();
		pnlAreaTour.setPreferredSize(new Dimension(320, 35));
		pnlFillTour.add(pnlAreaTour);
		pnlAreaTour.setLayout(null);
			
		lblAreaTour = new JLabel("Area");
		lblAreaTour.setBounds(32, 11, 60, 25);
		lblAreaTour.setPreferredSize(new Dimension(60, 25));
		pnlAreaTour.add(lblAreaTour);
		
		cbBoxArea = new JComboBox();
		cbBoxArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		cbBoxArea.setModel(new DefaultComboBoxModel(new String[] {"Miền Bắc", "Miền Trung", "Miền Nam"}));
		cbBoxArea.setBounds(161, 11, 103, 22);
		pnlAreaTour.add(cbBoxArea);
		
		pnlNumOfDay = new JPanel();
		pnlNumOfDay.setPreferredSize(new Dimension(320, 35));
		pnlFillTour.add(pnlNumOfDay);
		pnlNumOfDay.setLayout(null);
		
		lblNumOfDay = new JLabel("Number of days");
		lblNumOfDay.setBounds(32, 11, 95, 25);
		lblNumOfDay.setPreferredSize(new Dimension(60, 25));
		pnlNumOfDay.add(lblNumOfDay);
		
		cbBoxNumOfDay = new JComboBox();
		cbBoxNumOfDay.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		cbBoxNumOfDay.setModel(new DefaultComboBoxModel(new String[] {"2 Ngày 1 Đêm", "2 Ngày 2 Đêm", "3 Ngày 2 Đêm" , "3 Ngày 3 Đêm" , "4 Ngày 3 Đêm"}));
		cbBoxNumOfDay.setBounds(161, 12, 103, 22);
		pnlNumOfDay.add(cbBoxNumOfDay);
		
		pnlNumOfPeople = new JPanel();
		pnlNumOfPeople.setPreferredSize(new Dimension(320, 35));
		pnlFillTour.add(pnlNumOfPeople);
		pnlNumOfPeople.setLayout(null);
		
		lblNumOfPeople = new JLabel("Number of peoples");
		lblNumOfPeople.setBounds(32, 11, 119, 25);
		lblNumOfPeople.setPreferredSize(new Dimension(60, 25));
		pnlNumOfPeople.add(lblNumOfPeople);
		
		cbBoxNumOfPeople = new JComboBox();
		cbBoxNumOfPeople.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		cbBoxNumOfPeople.setModel(new DefaultComboBoxModel(new String[] {"29", "35", "45" , "50"}));
		cbBoxNumOfPeople.setBounds(161, 12, 47, 22);
		pnlNumOfPeople.add(cbBoxNumOfPeople);
		
		pnlButtonTour = new JPanel();
		pnlButtonTour.setPreferredSize(new Dimension(10, 35));
		pnlEditTour.add(pnlButtonTour, BorderLayout.SOUTH);
		pnlButtonTour.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnAddTour = new JButton("Add");
		btnAddTour.setPreferredSize(new Dimension(100, 25));
		pnlButtonTour.add(btnAddTour);	
		
		pnlTourList = new JPanel();
		pnlTourList.setBorder(new TitledBorder(null, "Tour List", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlEditAndListTour.add(pnlTourList);
		pnlTourList.setLayout(new GridLayout(0, 1, 0, 0));
		
		listTour = new JList();
		pnlTourList.add(listTour);
		
		panel_3 = new JPanel();
		panel_3.setPreferredSize(new Dimension(50, 10));
		pnlContentTour.add(panel_3, BorderLayout.EAST);
		
		panel_4 = new JPanel();
		panel_4.setPreferredSize(new Dimension(50, 10));
		pnlContentTour.add(panel_4, BorderLayout.WEST);
		
		panel_5 = new JPanel();
		panel_5.setPreferredSize(new Dimension(10, 70));
		pnlContentTour.add(panel_5, BorderLayout.SOUTH);
		panel_5.setLayout(null);
	}
	
	public void Page_StaffManager() {	
		pnlContentStaff = new JPanel();
		pnlContentStaff.setBackground(new Color(255, 255, 255));
		getContentPane().add(pnlContentStaff, BorderLayout.CENTER);
		pnlContentStaff.setLayout(new BorderLayout(0, 0));
		
		pnlContentTitleStaff = new JPanel();
		pnlContentTitleStaff.setPreferredSize(new Dimension(10, 100));
		pnlContentStaff.add(pnlContentTitleStaff, BorderLayout.NORTH);
		pnlContentTitleStaff.setLayout(new BorderLayout(0, 0));
		
		lblContentTitleStaff = new JLabel("Staff Manager");
		lblContentTitleStaff.setPreferredSize(new Dimension(200, 75));
		lblContentTitleStaff.setHorizontalAlignment(SwingConstants.CENTER);
		lblContentTitleStaff.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		pnlContentTitleStaff.add(lblContentTitleStaff, BorderLayout.CENTER);
		
		pnlSearchStaff = new JPanel();
		pnlSearchStaff.setPreferredSize(new Dimension(10, 40));
		pnlContentTitleStaff.add(pnlSearchStaff, BorderLayout.SOUTH);
		
		lblSearchStaff = new JLabel("");
		lblSearchStaff.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(EmpManager.class.getResource("search.png"))));
		lblSearchStaff.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlSearchStaff.add(lblSearchStaff);
		
		txtSearchStaff = new JTextField();
		txtSearchStaff.setPreferredSize(new Dimension(7, 32));
		pnlSearchStaff.add(txtSearchStaff);
		txtSearchStaff.setColumns(40);
		
		pnlContentStaffDetail = new JPanel();
		pnlContentStaff.add(pnlContentStaffDetail, BorderLayout.CENTER);
		pnlContentStaffDetail.setLayout(new BorderLayout(0, 0));
		
		pnlEditAndListStaff = new JPanel();
		pnlContentStaffDetail.add(pnlEditAndListStaff, BorderLayout.CENTER);
		pnlEditAndListStaff.setLayout(new GridLayout(1, 2, 0, 0));
		
		pnlEditStaff = new JPanel();
		pnlEditAndListStaff.add(pnlEditStaff);
		pnlEditStaff.setLayout(new BorderLayout(0, 0));
		
		scrollFillInforStaff = new JScrollPane();
		scrollFillInforStaff.setBorder(new TitledBorder(null, "Edit Staff", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlEditStaff.add(scrollFillInforStaff);
		
		pnlFillStaff = new JPanel();
		scrollFillInforStaff.setViewportView(pnlFillStaff);
		pnlFillStaff.setLayout(new GridLayout(8, 1, 0, 0));
		
		pnlIdStaff = new JPanel();
		pnlIdStaff.setPreferredSize(new Dimension(320, 35));
		pnlFillStaff.add(pnlIdStaff);
		pnlIdStaff.setLayout(null);
		
		lblIdStaff = new JLabel("ID");
		lblIdStaff.setBounds(32, 11, 60, 25);
		lblIdStaff.setPreferredSize(new Dimension(60, 25));
		pnlIdStaff.add(lblIdStaff);
		
		txtIdStaff = new JTextField();
		txtIdStaff.setBounds(124, 11, 117, 25);
		txtIdStaff.setPreferredSize(new Dimension(100, 25));
		pnlIdStaff.add(txtIdStaff);
		txtIdStaff.setColumns(20);
		
		pnlNameStaff = new JPanel();
		pnlNameStaff.setPreferredSize(new Dimension(320, 35));
		pnlFillStaff.add(pnlNameStaff);
		pnlNameStaff.setLayout(null);
		
		lblNameStaff = new JLabel("Name");
		lblNameStaff.setBounds(32, 11, 60, 25);
		lblNameStaff.setPreferredSize(new Dimension(60, 25));
		pnlNameStaff.add(lblNameStaff);
		
		txtNameStaff = new JTextField();
		txtNameStaff.setBounds(124, 11, 200, 25);
		txtNameStaff.setPreferredSize(new Dimension(100, 25));
		txtNameStaff.setColumns(20);
		pnlNameStaff.add(txtNameStaff);
		
		pnlRoleStaff = new JPanel();
		pnlRoleStaff.setPreferredSize(new Dimension(320, 35));
		pnlFillStaff.add(pnlRoleStaff);
		pnlRoleStaff.setLayout(null);
			
		lblRoleStaff = new JLabel("Role");
		lblRoleStaff.setBounds(32, 11, 60, 25);
		lblRoleStaff.setPreferredSize(new Dimension(60, 25));
		pnlRoleStaff.add(lblRoleStaff);
		
		bgEmpRole = new ButtonGroup();
		rdbtnEmployee = new JRadioButton("Employee");
		rdbtnEmployee.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		rdbtnEmployee.setFocusPainted(false);
		rdbtnEmployee.setBounds(120, 11, 83, 25);
		rdbtnEmployee.setPreferredSize(new Dimension(83, 25));
		pnlRoleStaff.add(rdbtnEmployee);
		bgEmpRole.add(rdbtnEmployee);
		
		rdbtnManager = new JRadioButton("Manager");
		rdbtnManager.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		rdbtnManager.setFocusPainted(false);
		rdbtnManager.setBounds(220, 11, 82, 25);
		rdbtnManager.setPreferredSize(new Dimension(82, 25));
		pnlRoleStaff.add(rdbtnManager);
		bgEmpRole.add(rdbtnManager);
		
		pnlGenderStaff = new JPanel();
		pnlGenderStaff.setPreferredSize(new Dimension(320, 35));
		pnlFillStaff.add(pnlGenderStaff);
		pnlGenderStaff.setLayout(null);
		
		lblGenderStaff = new JLabel("Gender");
		lblGenderStaff.setBounds(32, 11, 60, 25);
		lblGenderStaff.setPreferredSize(new Dimension(60, 25));
		pnlGenderStaff.add(lblGenderStaff);
		
		bgEmpGen = new ButtonGroup();
		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		rdbtnMale.setFocusPainted(false);
		rdbtnMale.setBounds(120, 11, 83, 25);
		rdbtnMale.setPreferredSize(new Dimension(83, 25));
		pnlGenderStaff.add(rdbtnMale);
		bgEmpGen.add(rdbtnMale);
		
		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		rdbtnFemale.setFocusPainted(false);
		rdbtnFemale.setBounds(220, 11, 82, 25);
		rdbtnFemale.setPreferredSize(new Dimension(82, 25));
		pnlGenderStaff.add(rdbtnFemale);
		bgEmpGen.add(rdbtnFemale);
			
		pnlAgeStaff = new JPanel();
		pnlAgeStaff.setPreferredSize(new Dimension(320, 35));
		pnlFillStaff.add(pnlAgeStaff);
		pnlAgeStaff.setLayout(null);
		
		lblAgeStaff = new JLabel("Date of birth");
		lblAgeStaff.setBounds(32, 11, 80, 25);
		lblAgeStaff.setPreferredSize(new Dimension(60, 25));
		pnlAgeStaff.add(lblAgeStaff);
		
		txtDay = new JTextField();
		txtDay.setBounds(124, 11, 27, 25);
		txtDay.setPreferredSize(new Dimension(100, 25));
		txtDay.setColumns(20);
		pnlAgeStaff.add(txtDay);
		
		lblNewLabel = new JLabel("/");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(152, 11, 5, 25);
		pnlAgeStaff.add(lblNewLabel);
		
		txtMonth = new JTextField();
		txtMonth.setPreferredSize(new Dimension(100, 25));
		txtMonth.setColumns(20);
		txtMonth.setBounds(158, 11, 27, 25);
		pnlAgeStaff.add(txtMonth);
		
		lblNewLabel_1 = new JLabel("/");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(186, 11, 5, 25);
		pnlAgeStaff.add(lblNewLabel_1);
		
		txtYear = new JTextField();
		txtYear.setPreferredSize(new Dimension(100, 25));
		txtYear.setColumns(20);
		txtYear.setBounds(192, 11, 45, 25);
		pnlAgeStaff.add(txtYear);
		
		lblFomatAge = new JLabel("(dd/mm/yyyy)");
		lblFomatAge.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblFomatAge.setBounds(250, 11, 79, 25);
		pnlAgeStaff.add(lblFomatAge);
		
		pnlAddressStaff = new JPanel();
		pnlAddressStaff.setPreferredSize(new Dimension(320, 35));
		pnlFillStaff.add(pnlAddressStaff);
		pnlAddressStaff.setLayout(null);
		
		lblAddressStaff = new JLabel("Address");
		lblAddressStaff.setBounds(32, 11, 60, 25);
		lblAddressStaff.setPreferredSize(new Dimension(60, 25));
		pnlAddressStaff.add(lblAddressStaff);
		
		txtAddressStaff = new JTextField();
		txtAddressStaff.setBounds(124, 11, 200, 25);
		txtAddressStaff.setPreferredSize(new Dimension(100, 25));
		txtAddressStaff.setColumns(20);
		pnlAddressStaff.add(txtAddressStaff);
		
		pnlPhoneStaff = new JPanel();
		pnlPhoneStaff.setPreferredSize(new Dimension(320, 35));
		pnlFillStaff.add(pnlPhoneStaff);
		pnlPhoneStaff.setLayout(null);
		
		lblPhoneStaff = new JLabel("Phone");
		lblPhoneStaff.setBounds(32, 11, 60, 25);
		lblPhoneStaff.setPreferredSize(new Dimension(60, 25));
		pnlPhoneStaff.add(lblPhoneStaff);
		
		txtPhoneStaff = new JTextField();
		txtPhoneStaff.setBounds(124, 11, 200, 25);
		txtPhoneStaff.setPreferredSize(new Dimension(100, 25));
		txtPhoneStaff.setColumns(20);
		pnlPhoneStaff.add(txtPhoneStaff);
		
		pnlEmailStaff = new JPanel();
		pnlEmailStaff.setPreferredSize(new Dimension(320, 35));
		pnlFillStaff.add(pnlEmailStaff);
		pnlEmailStaff.setLayout(null);
		
		lblEmailStaff = new JLabel("Email");
		lblEmailStaff.setBounds(32, 11, 60, 25);
		lblEmailStaff.setPreferredSize(new Dimension(60, 25));
		pnlEmailStaff.add(lblEmailStaff);
		
		txtEmailStaff = new JTextField();
		txtEmailStaff.setBounds(124, 11, 200, 25);
		txtEmailStaff.setPreferredSize(new Dimension(100, 25));
		txtEmailStaff.setColumns(20);
		pnlEmailStaff.add(txtEmailStaff);
		
		pnlAddStaff = new JPanel();
		pnlAddStaff.setPreferredSize(new Dimension(10, 40));
		pnlEditStaff.add(pnlAddStaff, BorderLayout.SOUTH);
		pnlAddStaff.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnAddStaff = new JButton("Add");
		btnAddStaff.setPreferredSize(new Dimension(120, 30));
		pnlAddStaff.add(btnAddStaff);
		
		pnlStaffList = new JPanel();
		pnlStaffList.setBorder(new TitledBorder(null, "Staff List", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlEditAndListStaff.add(pnlStaffList);
		pnlStaffList.setLayout(new GridLayout(0, 1, 0, 0));
		
		listStaff = new JList();
		pnlStaffList.add(listStaff);
		
		panel_3 = new JPanel();
		panel_3.setPreferredSize(new Dimension(50, 10));
		pnlContentStaffDetail.add(panel_3, BorderLayout.EAST);
		
		panel_4 = new JPanel();
		panel_4.setPreferredSize(new Dimension(50, 10));
		pnlContentStaffDetail.add(panel_4, BorderLayout.WEST);
		
		panel_5 = new JPanel();
		panel_5.setPreferredSize(new Dimension(10, 70));
		pnlContentStaffDetail.add(panel_5, BorderLayout.SOUTH);
		panel_5.setLayout(null);
		
		pnlContentTour.setVisible(false);
		
	}
	
	public void Page_TourManager() {
		pnlContentTour.setVisible(false);
		pnlContentTour.setVisible(true);
	}

	public void ZoomOutMenu() {
		MouseListener mouseListener = new EmpMgrControl(this);
		lblIconZoomIn = new JLabel("", JLabel.CENTER);
		lblIconZoomIn.setBounds(0, 0, 50, 33);
		lblIconZoomIn.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(EmpManager.class.getResource("zoomin.png"))));
		lblIconZoomIn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblIconZoomIn.addMouseListener(mouseListener);
		pnlZoom.add(lblIconZoomIn);
		pnlMenuDetail.setVisible(false);
		lblIconZoomOut.setVisible(false);
		lblIconZoomIn.setVisible(true);
	}
	
	public void ZoomInMenu() {
		pnlMenuDetail.setVisible(true);
		lblIconZoomOut.setVisible(true);
		lblIconZoomIn.setVisible(false);	
	}
}
