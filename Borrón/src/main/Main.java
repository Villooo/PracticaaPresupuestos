package main;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String desbloqueo = "12341234";
		String Menu;
		String User1,User2;
		String Password1 = null,Password2,Password3;
		int Selector;
		Object[] opcion = { "iniciar sesión", " Registrarme "};
		Object[] fallo = { "Volver a intentar"};
		Object[] MenuPrincipal = { "Generar presupuesto", "Cambiar contraseña","Opciones"};
		Object[] MenuPresupuestos1 = {"Premontado","A piezas"};
		Object [] MenuPremontado = {"+2000€","2000€-1500€","1500€-1000€"+"1000€-500€","-500€"};
		String Presupuesto;
		String p1 = "Una buena opción de ordenador por mas de 2000€ puede ser este: \n https://www.pccomponentes.com/msi-creator-p100x-12vte-1214es-intel-core-i7-12700k-32gb-2tb-1tb-ssd-rtx-3080";
		String p2 = "Una buena opción de ordenador entre 1500€ y 2000€ puede ser este: \n https://www.pccomponentes.com/pccom-gold-intel-core-i5-12600k-16gb-1tb-rtx3060-windows-11-home";
		String p3 = "Una buena opción de ordenador entre 1000€ y 1500€ puede ser este: \n https://www.pccomponentes.com/lenovo-legion-t5-26iab7-intel-core-i7-12700f-16gb-512gb-ssd-1tb-hdd-rtx-3060ti";
		String p4 = "Una buena opción de ordenador entre 500€ y 1000€ puede ser este: \n Medion Akoya S72 Intel Core i5-12400/16GB/1TB+256GB SSD";
		String p5 = "Una buena opción de ordenador por menos de 500€ puede ser este: \n https://www.pccomponentes.com/pccom-basic-essential-intel-core-i3-10100-8gb-480gbssd";
		Object [] GamaPc = {"Gamma alta","Gama media","Gama baja"};
		Object [] UsoPC = {"PC Multimedia","PC Edición","PC Gaming"};
		
		String GAM ="Procesador: https://www.pccomponentes.com/amd-ryzen-5-5600g-440ghz?offer=e8d8dabb-116e-48f9-9bec-88ae5cc90235 \n Memoria RAM: https://www.pccomponentes.com/corsair-vengeance-rgb-pro-optimizado-amd-ddr4-3200-16gb-2x8gb-cl16 \nDisipador CPU: https://www.pccomponentes.com/nzxt-kraken-120-kit-de-refrigeracion-liquida-120mm \nDisco duro: https://www.pccomponentes.com/western-digital-blue-3d-nand-sata-ssd-m2-2280-500gb \nPlaca Base: https://www.pccomponentes.com/msi-mag-b550m-mortar-wifi \nFuente de alimentación: https://www.pccomponentes.com/corsair-cv550-cv-series-550w-80-plus-bronze \nCaja: https://www.pccomponentes.com/corsair-crystal-series-280x-rgb-usb-30-cristal-templado-negro";
		String GMM ="Procesador: https://www.pccomponentes.com/amd-ryzen-3-3200g-36-ghz-box \nMemoria RAM:https://www.pccomponentes.com/corsair-vengeance-rgb-pro-optimizado-amd-ddr4-3200-16gb-2x8gb-cl16 \nDisipador CPU: https://www.pccomponentes.com/thermaltake-th120-argb-sync-all-in-one-120mm-kit-refrigeracion-liquida \nDisco duro: https://www.pccomponentes.com/western-digital-blue-3d-nand-sata-ssd-m2-2280-500gb \nPlaca Base: https://www.pccomponentes.com/asrock-b450m-steel-legend \nFuente de alimentación: https://www.pccomponentes.com/corsair-cv550-cv-series-550w-80-plus-bronze \nCaja: https://www.pccomponentes.com/cooler-master-masterbox-mb311l-argb-cristal-templado-usb-32";
		String GBM = "Procesador: https://www.pccomponentes.com/amd-ryzen-3-3200g-36-ghz-box \nMemoria RAM: https://www.pccomponentes.com/corsair-vengeance-rgb-pro-ddr4-3200-pc4-25600-32gb-2x16gb-cl16 \nDisipador CPU: https://www.pccomponentes.com/aerocool-pulse-l120f-kit-refrigeracion-liquida-rgb?offer=40574e57-be1c-426a-80d4-477ed545d46e \nDisco duro:  https://www.pccomponentes.com/kingston-a400-ssd-240gb \nPlaca Base: https://www.pccomponentes.com/msi-a320m-a-pro-max \nFuente de alimentación: https://www.pccomponentes.com/mars-gaming-mpb550-550w-80-plus-bronze \nCaja: https://www.pccomponentes.com/aerocool-cs107v2-frgb-usb-30-con-ventana-negra ";
		String GAE ="Procesador: https://www.pccomponentes.com/amd-ryzen-9-5950x-34-ghz \nTarjeta Gráfica: https://www.pccomponentes.com/zotac-gaming-geforce-rtx-3080-trinity-amp-holo-lhr-10gb-gddr6x?offer=d86a10f8-53d6-49b7-91c9-a0a134f1a998 \nMemoria RAM: https://www.pccomponentes.com/corsair-dominator-platinum-rgb-ddr5-5200mhz-64gb-2x32gb-cl40 \nDisipador CPU: https://www.pccomponentes.com/nzxt-kraken-x73-kit-de-refrigeracion-liquida \nDisco duro1: https://www.pccomponentes.com/corsair-force-series-gen4-mp600-nvme-m2-2tb-ssd \nDisco duro2: https://www.pccomponentes.com/seagate-ironwolf-pro-8tb-35-sata3 \nPlaca Base: https://www.pccomponentes.com/msi-mag-b550m-mortar-wifi \nFuente de alimentación: https://www.pccomponentes.com/corsair-rm-series-rm850-850w-80-plus-gold-full-modular \nCaja: https://www.pccomponentes.com/corsair-crystal-series-280x-rgb-usb-30-cristal-templado-blanco ";
		String GME ="Procesador: https://www.pccomponentes.com/amd-ryzen-9-5900x-37-ghz \nTarjeta gráfica: https://www.pccomponentes.com/zotac-gaming-geforce-rtx-3070-twin-edge-oc-lhr-8gb-gddr6 \nMemoria RAM: https://www.pccomponentes.com/corsair-vengeance-rgb-pro-ddr4-3200-pc4-25600-32gb-2x16gb-cl16 \nDisipador CPU: https://www.pccomponentes.com/thermaltake-th120-argb-sync-all-in-one-120mm-kit-refrigeracion-liquida \nDisco duro1: https://www.pccomponentes.com/wd-blue-sn550-ssd-1tb-nvme-m2-pcie-gen-3?offer=dee1ecac-a553-4a3d-b11a-6095ce56824d   \nDisco duro2: https://www.pccomponentes.com/seagate-ironwolf-pro-8tb-35-sata3 \nPlaca Base: https://www.pccomponentes.com/gigabyte-b550m-aorus-pro-p \nFuente de alimentación: https://www.pccomponentes.com/corsair-rm-series-rm850-850w-80-plus-gold-full-modular \nCaja: https://www.pccomponentes.com/cooler-master-masterbox-mb311l-argb-cristal-templado-usb-32 ";
		String GBE = "Procesador: https://www.pccomponentes.com/amd-ryzen-5-5600g-440ghz?offer=e8d8dabb-116e-48f9-9bec-88ae5cc90235 \nTarjeta gráfica: https://www.pccomponentes.com/zotac-gaming-geforce-rtx-3060-amp-white-edition-lhr-12gb-gddr6 \nMemoria RAM: https://www.pccomponentes.com/corsair-dominator-platinum-rgb-ddr5-5200mhz-64gb-2x32gb-cl40 \nDisipador CPU: https://www.pccomponentes.com/aerocool-pulse-l120f-kit-refrigeracion-liquida-rgb?offer=40574e57-be1c-426a-80d4-477ed545d46e \nDisco duro1: https://www.pccomponentes.com/corsair-force-series-gen4-mp600-nvme-m2-2tb-ssd \nDisco duro2 https://www.pccomponentes.com/toshiba-canvio-advance-4tb-25-usb-31-negro-rugged \nPlaca Base: https://www.pccomponentes.com/msi-mag-b550m-mortar-wifi \nFuente de alimentación: https://www.pccomponentes.com/mars-gaming-mpb550-550w-80-plus-bronze \nCaja: https://www.pccomponentes.com/aerocool-cs107v2-frgb-usb-30-con-ventana-negra ";
		String GAG = "Procesador: https://www.pccomponentes.com/amd-ryzen-7-5800x3d-34ghz \nTarjeta gráfica: https://www.pccomponentes.com/asus-rog-strix-geforce-rtx-3090-gaming-oc-24gb-gddr6x?offer=3aaafb6f-42e2-4425-b00b-ad607a00d3b4 \n Memoria RAM: https://www.pccomponentes.com/corsair-vengeance-rgb-pro-ddr4-3200-pc4-25600-32gb-2x16gb-cl16 \n Disipador CPU: https://www.pccomponentes.com/nzxt-kraken-x73-rgb-kit-de-refrigeracion-liquida-blanco \nDisco duro: https://www.pccomponentes.com/samsung-980-pro-1tb-ssd-pcie-40-nvme-m2-con-disipador-de-calor \nPlaca Base: https://www.pccomponentes.com/msi-mag-b550m-mortar-wifi \nFuente de alimentación: https://www.pccomponentes.com/be-quiet-straight-power-11-platinum-1200w-80-plus-platinum-modular \nCaja: https://www.pccomponentes.com/corsair-crystal-series-280x-rgb-usb-30-cristal-templado-blanco ";
		String GMG = "Procesador: https://www.pccomponentes.com/intel-core-i7-11700-25-ghz \nTarjeta gráfica: https://www.pccomponentes.com/gskill-trident-z-rgb-ddr4-3200-pc4-25600-16gb-2x8gb-cl16 \n Memoria RAM: https://www.pccomponentes.com/zotac-gaming-geforce-rtx-3080-trinity-amp-holo-lhr-10gb-gddr6x?offer=d86a10f8-53d6-49b7-91c9-a0a134f1a998 \nDisipador CPU: https://www.pccomponentes.com/thermaltake-th120-argb-sync-all-in-one-120mm-kit-refrigeracion-liquida \nDisco duro: https://www.pccomponentes.com/gigabyte-z590m-gaming-x \nPlaca Base: https://www.pccomponentes.com/wd-blue-sn550-ssd-1tb-nvme-m2-pcie-gen-3 \nFuente de alimentación: https://www.pccomponentes.com/corsair-rmx-series-rm850x-850w-80-plus-gold-modular \nCaja: https://www.pccomponentes.com/cooler-master-masterbox-mb311l-argb-cristal-templado-usb-32-con-controlador-argb ";
		String GBG ="Procesador: https://www.pccomponentes.com/cooler-master-masterbox-mb311l-argb-cristal-templado-usb-32-con-controlador-argb \nTarjeta gráfica: https://www.pccomponentes.com/asus-rog-strix-geforce-rtx-3090-gaming-oc-24gb-gddr6x?offer=3aaafb6f-42e2-4425-b00b-ad607a00d3b4 \n Memoria RAM: https://www.pccomponentes.com/corsair-vengeance-rgb-pro-ddr4-3200-pc4-25600-32gb-2x16gb-cl16 \nDisipador CPU: https://www.pccomponentes.com/nzxt-kraken-x73-rgb-kit-de-refrigeracion-liquida-blanco \nDisco duro: https://www.pccomponentes.com/gigabyte-z590m-gaming-x \nPlaca Base: https://www.pccomponentes.com/wd-blue-sn550-ssd-1tb-nvme-m2-pcie-gen-3 \nFuente de alimentación: https://www.pccomponentes.com/corsair-rmx-series-rm850x-850w-80-plus-gold-modular \nCaja: https://www.pccomponentes.com/cooler-master-masterbox-mb311l-argb-cristal-templado-usb-32-con-controlador-argb ";
				

		
		Selector = JOptionPane.showOptionDialog(null,            //mensaje con opciones
				 "Selector de opciones","Que quiere hacer?",
				 JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,
				 opcion, null);
		
		switch (Selector) {
		     
			case 0 :
				User1 = JOptionPane.showInputDialog("Por favor introduzca su nombre de usuario."); 
				 while (!User1.equals(desbloqueo)) {
					 Menu = JOptionPane.showInputDialog("El nombre de usuario: "+User1+" no se ha encontrado, por favor intentalo de nuevo");
					 User1 = JOptionPane.showInputDialog("Por favor introduzca su nombre de usuario.");
					}
				 Password1 = JOptionPane.showInputDialog("Por favor introduzca su contraseña");

				 JOptionPane.showMessageDialog(null,"Bienvenido de nuevo "+User1+" a tuCreadorDePresupuestosOnline");
				 
				 break;
	
			case 1 :
				User1 = JOptionPane.showInputDialog("Por favor introduzca un nombre de usuario.");
				Password1 = JOptionPane.showInputDialog("Por favor introduzca una contraseña.");
				Password2 = JOptionPane.showInputDialog("Por favor introduzca la contraseña de nuevo.");
				
				
				while (!Password1.equals(Password2)) {
					Selector = JOptionPane.showOptionDialog(null,            //mensaje con opciones
							 "Selector de opciones","Que quiere hacer?",
							 JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,
							 fallo, null);
					Password1 = JOptionPane.showInputDialog("Por favor introduzca una contraseña.");
					Password2 = JOptionPane.showInputDialog("Por favor introduzca la contraseña de nuevo.");
					}
				JOptionPane.showMessageDialog(null,"Bienvenido "+User1+" a tuCreadorDePresupuestosOnline");	
				break;
					} //break del primer switch
		
		Selector = JOptionPane.showOptionDialog(null,"¿Qué quiere hacer ahora?","Menu principal",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,MenuPrincipal,null); //Menu principal
		
			switch (Selector) {
				case 0 :
					Selector = JOptionPane.showOptionDialog(null,"Menu de elcción de prespuestos.","¿Qué quiere hacer ahora?",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,MenuPresupuestos1,null); //Menu para elejir como quiere el presupuesto	
						switch (Selector) {
							case 0 :
								Selector = JOptionPane.showOptionDialog(null,"Menu de elección de prespuestos segun el presupuesto.","¿Qué quiere hacer ahora?",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,MenuPremontado,null); //Menu para elejir dependiendo del presupuesto disponible
						
							switch (Selector) {
					    		 	case 0:
					    		 		JOptionPane.showMessageDialog(null,p1);	
					    		 		break;
					    		 	case 1:
					    		 		JOptionPane.showMessageDialog(null,p2);	
					    		 		break;
					    		 	case 2:
					    		 		JOptionPane.showMessageDialog(null,p3);	
					    		 		break;
					    		 	case 3:
					    		 		JOptionPane.showMessageDialog(null,p4);	
					    		 		break;
					    		 	case 4:
					    		 		JOptionPane.showMessageDialog(null,p5);	
					    		 		break;
					    		 
					    		 }
							case 1 :
								
								Object gammapc = JOptionPane.showInputDialog(null,"Seleccione opcion","Selector de opciones",JOptionPane.QUESTION_MESSAGE,null,new Object[] { "Gamma alta", "Gamma media", "Gamma baja" },null);
								Object usopc = JOptionPane.showInputDialog(null,"Seleccione opcion","Selector de opciones",JOptionPane.QUESTION_MESSAGE,null,new Object[] { "PC Multimedia", "PC Edición", "PC Gamíng" },null);
								if (gammapc=="Gamma alta"&&usopc=="PC Multimedia"){
									JOptionPane.showMessageDialog(null,GAM);	
								};
								if (gammapc=="Gamma alta"&&usopc=="PC Edición"){
									JOptionPane.showMessageDialog(null,GAE);
								};
								if (gammapc=="Gamma alta"&&usopc=="PC Gamíng"){
									JOptionPane.showMessageDialog(null,GAG);
								};
								
								if (gammapc=="Gamma media"&&usopc=="PC Multimedia"){
									JOptionPane.showMessageDialog(null,GMM);
								};
								if (gammapc=="Gamma media"&&usopc=="PC Edición"){
									JOptionPane.showMessageDialog(null,GME);
								};
								if (gammapc=="Gamma media"&&usopc=="PC Gamíng"){
									JOptionPane.showMessageDialog(null,GMG);
								};
								
								if (gammapc=="Gamma baja"&&usopc=="PC Multimedia"){
									JOptionPane.showMessageDialog(null,GBM);
								};
								if (gammapc=="Gamma baja"&&usopc=="PC Edición"){
									JOptionPane.showMessageDialog(null,GBE);
								};
								if (gammapc=="Gamma baja"&&usopc=="PC Gamíng"){
									JOptionPane.showMessageDialog(null,GBG);
								};
								
									
							
							break; 	 }
						
						
						break;
				case 1 : 
						Password2 = JOptionPane.showInputDialog("Bienvenido al menu de cambio de contraseña, por favor introduzca su antigua contraseña");
						
						if (Password2==Password1) {
							Password1 = JOptionPane.showInputDialog("Por favor introduzca una contraseña.");
							Password3 = JOptionPane.showInputDialog("Por favor introduzca la contraseña de nuevo.");
						
				
					while (!Password1.equals(Password3)) {Selector = JOptionPane.showOptionDialog(null,"Selector de opciones","Que quiere hacer?",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,fallo, null);
						Password1 = JOptionPane.showInputDialog("Por favor introduzca una contraseña.");
						Password2 = JOptionPane.showInputDialog("Por favor introduzca la contraseña de nuevo.");
						} }
						
						else {
						while (!Password1.equals(Password2)) {Selector = JOptionPane.showOptionDialog(null,"Selector de opciones","Que quiere hacer?",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,fallo, null);
						Password2=JOptionPane.showInputDialog("La contraseña introducida no coincide con tu contraseña actual, por favor vulve a intentarlo");
																}
								}
			
			
			
			}	
			
			
			
			
			
			}}
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	


