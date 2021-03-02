package ex0218.exercise;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class MenuExam extends JFrame {
	JMenuBar menuBar = new JMenuBar();
	JMenu file = new JMenu("파일(F)");
	JMenu edit = new JMenu("편집");
	JMenu help = new JMenu("Help");
	JMenu align = new JMenu("정렬");
	JMenuItem nFile = new JMenuItem("새파일");
	JMenuItem open = new JMenuItem("열기");
	JMenuItem save = new JMenuItem("저장");
	JMenuItem exit = new JMenuItem("종료");
	
	
	JCheckBoxMenuItem name = new JCheckBoxMenuItem("이름");
	JCheckBoxMenuItem date = new JCheckBoxMenuItem("날짜");
	
	JMenuItem info = new JMenuItem("정보");
	
	JTextArea text = new JTextArea();
	JScrollPane jsp = new JScrollPane(text,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	
	JDialog dialog = new JDialog(this, "help");
	JLabel dName= new JLabel("kang seok min"  );
	JButton enter = new JButton("확 인");

	
	BufferedInputStream bi = null;
	
	public MenuExam(){
		super("제목없음");
		Container con = getContentPane();
	
		//메뉴 단축키
		file.setMnemonic('F'); //Alt + F
		
		
		
		//메뉴아이템에 단축키
		nFile.setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.CTRL_DOWN_MASK));
		save.setAccelerator(KeyStroke.getKeyStroke('S', InputEvent.CTRL_MASK));
		open.setAccelerator(KeyStroke.getKeyStroke('O', InputEvent.CTRL_MASK));
		exit.setAccelerator(KeyStroke.getKeyStroke('E', InputEvent.CTRL_MASK ^ InputEvent.ALT_MASK));
	
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(help);
		
		file.add(nFile);
		file.add(save);
		file.add(open);
		file.addSeparator();
		file.add(exit);
		
		edit.add(align);
		align.add(name);
		align.add(date);
		
		help.add(info);
		
		setJMenuBar(menuBar);
		con.add(jsp);
		
		Toolkit toolkit = getToolkit();
		Dimension dim = toolkit.getScreenSize();
		int screenWidth = dim.width;
		int screenHeight = dim.height;
		
		dName.setHorizontalAlignment(JLabel.CENTER);
		dialog.add(dName, "Center");
		dialog.add(enter, "South");
		dialog.setBounds(((screenWidth-200)/2), ((screenHeight-200)/2), 200, 200);
		
		setBounds(((screenWidth-500)/2), ((screenHeight-500)/2), 500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		nFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText(""); // text.append("");//끝에 추가!!!!
				MenuExam.this.setTitle("제목없음");
			}
		});
		
	
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog fileSave = new FileDialog(MenuExam.this, "Save", FileDialog.SAVE);
				fileSave.setVisible(true);
				
				String dir = fileSave.getDirectory();
				String fileName = fileSave.getFile();
				
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(dir + "/" + fileName))) {
					bw.write(text.getText());
					setTitle(fileName);
				} catch (IOException ie) {
					System.out.println("오류가 발생했습니다.");
				}
			}
		});
		
		open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileOpen = new JFileChooser();
				int mode = fileOpen.showOpenDialog(MenuExam.this);
				System.out.println("mode : " + mode);
				
				if(mode== JFileChooser.APPROVE_OPTION){
					File file = fileOpen.getSelectedFile();
					System.out.println(file);
					try(
							BufferedReader br = new BufferedReader(new FileReader(file));
					) {
						StringBuilder str = new StringBuilder();
						String load = "";
						while((load = br.readLine()) != null) {
							str.append(load + "\n");
						}
						str.deleteCharAt(str.lastIndexOf("\n"));
						text.setText(str.toString());
						setTitle(file.getName());
					} catch (IOException ie) {
						System.out.println("오류가 발생했습니다.");
					}
				}
			}
		});
		
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		info.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
				
			}
		});
		enter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.dispose();//다이얼로그창만 닫기
				
			}
		});
	}
	
	public static void main(String[] args) {
		new MenuExam();
	}

}







