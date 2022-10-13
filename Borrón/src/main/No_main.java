package main;

import javax.swing.JOptionPane;

public class No_main {

	
	String GAM ="Procesador: https://www.pccomponentes.com/amd-ryzen-5-5600g-440ghz?offer=e8d8dabb-116e-48f9-9bec-88ae5cc90235 \n Memoria RAM: https://www.pccomponentes.com/corsair-vengeance-rgb-pro-optimizado-amd-ddr4-3200-16gb-2x8gb-cl16 \nDisipador CPU: https://www.pccomponentes.com/nzxt-kraken-120-kit-de-refrigeracion-liquida-120mm \nDisco duro: https://www.pccomponentes.com/western-digital-blue-3d-nand-sata-ssd-m2-2280-500gb \nPlaca Base: https://www.pccomponentes.com/msi-mag-b550m-mortar-wifi \nFuente de alimentación: https://www.pccomponentes.com/corsair-cv550-cv-series-550w-80-plus-bronze \nCaja: https://www.pccomponentes.com/corsair-crystal-series-280x-rgb-usb-30-cristal-templado-negro";
	String GMM ="Procesador: https://www.pccomponentes.com/amd-ryzen-3-3200g-36-ghz-box \nMemoria RAM:https://www.pccomponentes.com/corsair-vengeance-rgb-pro-optimizado-amd-ddr4-3200-16gb-2x8gb-cl16 \nDisipador CPU: https://www.pccomponentes.com/thermaltake-th120-argb-sync-all-in-one-120mm-kit-refrigeracion-liquida \nDisco duro: https://www.pccomponentes.com/western-digital-blue-3d-nand-sata-ssd-m2-2280-500gb \nPlaca Base: https://www.pccomponentes.com/asrock-b450m-steel-legend \nFuente de alimentación: https://www.pccomponentes.com/corsair-cv550-cv-series-550w-80-plus-bronze \nCaja: https://www.pccomponentes.com/cooler-master-masterbox-mb311l-argb-cristal-templado-usb-32";
	String GBM = "Procesador: https://www.pccomponentes.com/amd-ryzen-3-3200g-36-ghz-box \nMemoria RAM: https://www.pccomponentes.com/corsair-vengeance-rgb-pro-ddr4-3200-pc4-25600-32gb-2x16gb-cl16 \nDisipador CPU: https://www.pccomponentes.com/aerocool-pulse-l120f-kit-refrigeracion-liquida-rgb?offer=40574e57-be1c-426a-80d4-477ed545d46e \nDisco duro:  https://www.pccomponentes.com/kingston-a400-ssd-240gb \nPlaca Base: https://www.pccomponentes.com/msi-a320m-a-pro-max \nFuente de alimentación: https://www.pccomponentes.com/mars-gaming-mpb550-550w-80-plus-bronze \nCaja: https://www.pccomponentes.com/aerocool-cs107v2-frgb-usb-30-con-ventana-negra ";
	String GAE ="Procesador: https://www.pccomponentes.com/amd-ryzen-9-5950x-34-ghz \nTarjeta Gráfica: https://www.pccomponentes.com/zotac-gaming-geforce-rtx-3080-trinity-amp-holo-lhr-10gb-gddr6x?offer=d86a10f8-53d6-49b7-91c9-a0a134f1a998 \nMemoria RAM: https://www.pccomponentes.com/corsair-dominator-platinum-rgb-ddr5-5200mhz-64gb-2x32gb-cl40 \nDisipador CPU: https://www.pccomponentes.com/nzxt-kraken-x73-kit-de-refrigeracion-liquida \nDisco duro1: https://www.pccomponentes.com/corsair-force-series-gen4-mp600-nvme-m2-2tb-ssd \nDisco duro2: https://www.pccomponentes.com/seagate-ironwolf-pro-8tb-35-sata3 \nPlaca Base: https://www.pccomponentes.com/msi-mag-b550m-mortar-wifi \nFuente de alimentación: https://www.pccomponentes.com/corsair-rm-series-rm850-850w-80-plus-gold-full-modular \nCaja: https://www.pccomponentes.com/corsair-crystal-series-280x-rgb-usb-30-cristal-templado-blanco ";
	String GME ="Procesador: https://www.pccomponentes.com/amd-ryzen-9-5900x-37-ghz \nTarjeta gráfica: https://www.pccomponentes.com/zotac-gaming-geforce-rtx-3070-twin-edge-oc-lhr-8gb-gddr6 \nMemoria RAM: https://www.pccomponentes.com/corsair-vengeance-rgb-pro-ddr4-3200-pc4-25600-32gb-2x16gb-cl16 \nDisipador CPU: https://www.pccomponentes.com/thermaltake-th120-argb-sync-all-in-one-120mm-kit-refrigeracion-liquida \nDisco duro1: https://www.pccomponentes.com/wd-blue-sn550-ssd-1tb-nvme-m2-pcie-gen-3?offer=dee1ecac-a553-4a3d-b11a-6095ce56824d   \nDisco duro2: https://www.pccomponentes.com/seagate-ironwolf-pro-8tb-35-sata3 \nPlaca Base: https://www.pccomponentes.com/gigabyte-b550m-aorus-pro-p \nFuente de alimentación: https://www.pccomponentes.com/corsair-rm-series-rm850-850w-80-plus-gold-full-modular \nCaja: https://www.pccomponentes.com/cooler-master-masterbox-mb311l-argb-cristal-templado-usb-32 ";
	String GBE = "Procesador: https://www.pccomponentes.com/amd-ryzen-5-5600g-440ghz?offer=e8d8dabb-116e-48f9-9bec-88ae5cc90235 \nTarjeta gráfica: https://www.pccomponentes.com/zotac-gaming-geforce-rtx-3060-amp-white-edition-lhr-12gb-gddr6 \nMemoria RAM: https://www.pccomponentes.com/corsair-dominator-platinum-rgb-ddr5-5200mhz-64gb-2x32gb-cl40 \nDisipador CPU: https://www.pccomponentes.com/aerocool-pulse-l120f-kit-refrigeracion-liquida-rgb?offer=40574e57-be1c-426a-80d4-477ed545d46e \nDisco duro1: https://www.pccomponentes.com/corsair-force-series-gen4-mp600-nvme-m2-2tb-ssd \nDisco duro2 https://www.pccomponentes.com/toshiba-canvio-advance-4tb-25-usb-31-negro-rugged \nPlaca Base: https://www.pccomponentes.com/msi-mag-b550m-mortar-wifi \nFuente de alimentación: https://www.pccomponentes.com/mars-gaming-mpb550-550w-80-plus-bronze \nCaja: https://www.pccomponentes.com/aerocool-cs107v2-frgb-usb-30-con-ventana-negra ";
	String GAG = "Procesador: https://www.pccomponentes.com/amd-ryzen-7-5800x3d-34ghz \nTarjeta gráfica: https://www.pccomponentes.com/asus-rog-strix-geforce-rtx-3090-gaming-oc-24gb-gddr6x?offer=3aaafb6f-42e2-4425-b00b-ad607a00d3b4 \n Memoria RAM: https://www.pccomponentes.com/corsair-vengeance-rgb-pro-ddr4-3200-pc4-25600-32gb-2x16gb-cl16 \n Disipador CPU: https://www.pccomponentes.com/nzxt-kraken-x73-rgb-kit-de-refrigeracion-liquida-blanco \nDisco duro: https://www.pccomponentes.com/samsung-980-pro-1tb-ssd-pcie-40-nvme-m2-con-disipador-de-calor \nPlaca Base: https://www.pccomponentes.com/msi-mag-b550m-mortar-wifi \nFuente de alimentación: https://www.pccomponentes.com/be-quiet-straight-power-11-platinum-1200w-80-plus-platinum-modular \nCaja: https://www.pccomponentes.com/corsair-crystal-series-280x-rgb-usb-30-cristal-templado-blanco ";
	String GMG = "Procesador: https://www.pccomponentes.com/intel-core-i7-11700-25-ghz \nTarjeta gráfica: https://www.pccomponentes.com/gskill-trident-z-rgb-ddr4-3200-pc4-25600-16gb-2x8gb-cl16 \n Memoria RAM: https://www.pccomponentes.com/zotac-gaming-geforce-rtx-3080-trinity-amp-holo-lhr-10gb-gddr6x?offer=d86a10f8-53d6-49b7-91c9-a0a134f1a998 \nDisipador CPU: https://www.pccomponentes.com/thermaltake-th120-argb-sync-all-in-one-120mm-kit-refrigeracion-liquida \nDisco duro: https://www.pccomponentes.com/gigabyte-z590m-gaming-x \nPlaca Base: https://www.pccomponentes.com/wd-blue-sn550-ssd-1tb-nvme-m2-pcie-gen-3 \nFuente de alimentación: https://www.pccomponentes.com/corsair-rmx-series-rm850x-850w-80-plus-gold-modular \nCaja: https://www.pccomponentes.com/cooler-master-masterbox-mb311l-argb-cristal-templado-usb-32-con-controlador-argb ";
	String GBG ="Procesador: https://www.pccomponentes.com/cooler-master-masterbox-mb311l-argb-cristal-templado-usb-32-con-controlador-argb \nTarjeta gráfica: https://www.pccomponentes.com/asus-rog-strix-geforce-rtx-3090-gaming-oc-24gb-gddr6x?offer=3aaafb6f-42e2-4425-b00b-ad607a00d3b4 \n Memoria RAM: https://www.pccomponentes.com/corsair-vengeance-rgb-pro-ddr4-3200-pc4-25600-32gb-2x16gb-cl16 \nDisipador CPU: https://www.pccomponentes.com/nzxt-kraken-x73-rgb-kit-de-refrigeracion-liquida-blanco \nDisco duro: https://www.pccomponentes.com/gigabyte-z590m-gaming-x \nPlaca Base: https://www.pccomponentes.com/wd-blue-sn550-ssd-1tb-nvme-m2-pcie-gen-3 \nFuente de alimentación: https://www.pccomponentes.com/corsair-rmx-series-rm850x-850w-80-plus-gold-modular \nCaja: https://www.pccomponentes.com/cooler-master-masterbox-mb311l-argb-cristal-templado-usb-32-con-controlador-argb ";
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	
	
	
	
	
	
	
	
	
	
}
