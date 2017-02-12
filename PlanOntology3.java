JButton btnNewFramea = new JButton("Deploy Tool");
		//add actionListener
		btnNewFramea.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//call the object of NewWindow and set visible true
				//NewWindow6 frame = new NewWindow6();
				//frame.setVisible(true);
				//set default close operation
				//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            new PlanToolPBE();
			}
		});
                
                
                btnNewFramea.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
		//set bounds of the Button
		btnNewFramea.setBounds(280, 650, 178, 25);
    