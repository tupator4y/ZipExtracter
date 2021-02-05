package govno.zalupa;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.custom.CLabel;

import java.io.IOException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;

import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Event;

public class Window {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Window window = new Window();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setImage(SWTResourceManager.getImage(Window.class, "/govno/zalupa/21s312.png"));
		shell.setBackgroundImage(null);
		shell.setSize(450, 300);
		shell.setText("СКААЧТЬ СБОРКУ ЧУ:к83во8");
		
		CLabel label = new CLabel(shell, SWT.NONE);
		label.setVisible(false);
		label.setForeground(SWTResourceManager.getColor(SWT.COLOR_MAGENTA));
		label.setFont(SWTResourceManager.getFont("Fixedsys", 18, SWT.NORMAL));
		label.setAlignment(SWT.CENTER);
		label.setBackground(SWTResourceManager.getColor(SWT.DRAW_TRANSPARENT));
		label.setBounds(0, 0, 434, 30);
		label.setText("ГОТОВО");
		
		CLabel lblNewLabel = new CLabel(shell, SWT.NONE);
		lblNewLabel.setBackgroundImage(SWTResourceManager.getImage(Window.class, "/govno/zalupa/3K4TYbjGndo.png"));
		lblNewLabel.setBounds(0, 0, 434, 235);
		lblNewLabel.setText("");
		
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setFont(SWTResourceManager.getFont("Fixedsys", 18, SWT.NORMAL));
		btnNewButton.setBounds(0, 231, 434, 30);
		btnNewButton.setText("СКАЧАТЬ СБОРКУ");
		btnNewButton.addListener(SWT.Selection, new Listener() {

			public void handleEvent(Event event) {
				try {
					Main.main(null);
					label.setVisible(true);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}
}

