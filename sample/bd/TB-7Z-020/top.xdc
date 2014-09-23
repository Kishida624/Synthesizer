set_property DONT_TOUCH true [get_cells design_1_i/processing_system7_0/inst]
set_property DONT_TOUCH true [get_cells design_1_i/processing_system7_0]
set_property DONT_TOUCH true [get_cells design_1_i]

set_property IOSTANDARD LVCMOS33 [get_ports {LED[*]}]
set_property PACKAGE_PIN H20 [get_ports {LED[0]}]
set_property PACKAGE_PIN G19 [get_ports {LED[1]}]
set_property PACKAGE_PIN F19 [get_ports {LED[2]}]
set_property PACKAGE_PIN E19 [get_ports {LED[3]}]
set_property PACKAGE_PIN E20 [get_ports {LED[4]}]
set_property PACKAGE_PIN G20 [get_ports {LED[5]}]
set_property PACKAGE_PIN G21 [get_ports {LED[6]}]
set_property PACKAGE_PIN F21 [get_ports {LED[7]}]

set_property PACKAGE_PIN D18 [get_ports SYS_CLK3]
set_property IOSTANDARD LVCMOS33 [get_ports SYS_CLK3]
create_clock -period 6.060 [get_ports SYS_CLK3]

set_property IOSTANDARD LVCMOS33 [get_ports DVI_*]
set_property SLEW FAST [get_ports DVI_*]

set_property PACKAGE_PIN F16 [get_ports {DVI_B[0]}]
set_property PACKAGE_PIN E16 [get_ports {DVI_B[1]}]
set_property PACKAGE_PIN D16 [get_ports {DVI_B[2]}]
set_property PACKAGE_PIN D17 [get_ports {DVI_B[3]}]
set_property PACKAGE_PIN E15 [get_ports {DVI_B[4]}]
set_property PACKAGE_PIN D15 [get_ports {DVI_B[5]}]
set_property PACKAGE_PIN G15 [get_ports {DVI_B[6]}]
set_property PACKAGE_PIN G16 [get_ports {DVI_B[7]}]

set_property DRIVE 8 [get_ports {DVI_B[7]}]
set_property DRIVE 8 [get_ports {DVI_B[6]}]
set_property DRIVE 8 [get_ports {DVI_B[5]}]
set_property DRIVE 8 [get_ports {DVI_B[4]}]
set_property DRIVE 8 [get_ports {DVI_B[3]}]
set_property DRIVE 8 [get_ports {DVI_B[2]}]
set_property DRIVE 8 [get_ports {DVI_B[1]}]
set_property DRIVE 8 [get_ports {DVI_B[0]}]

set_property PACKAGE_PIN F18 [get_ports {DVI_G[0]}]
set_property PACKAGE_PIN E18 [get_ports {DVI_G[1]}]
set_property PACKAGE_PIN G17 [get_ports {DVI_G[2]}]
set_property PACKAGE_PIN F17 [get_ports {DVI_G[3]}]
set_property PACKAGE_PIN C15 [get_ports {DVI_G[4]}]
set_property PACKAGE_PIN B15 [get_ports {DVI_G[5]}]
set_property PACKAGE_PIN B16 [get_ports {DVI_G[6]}]
set_property PACKAGE_PIN B17 [get_ports {DVI_G[7]}]

set_property DRIVE 8 [get_ports {DVI_G[7]}]
set_property DRIVE 8 [get_ports {DVI_G[6]}]
set_property DRIVE 8 [get_ports {DVI_G[5]}]
set_property DRIVE 8 [get_ports {DVI_G[4]}]
set_property DRIVE 8 [get_ports {DVI_G[3]}]
set_property DRIVE 8 [get_ports {DVI_G[2]}]
set_property DRIVE 8 [get_ports {DVI_G[1]}]
set_property DRIVE 8 [get_ports {DVI_G[0]}]

set_property PACKAGE_PIN A16 [get_ports {DVI_R[0]}]
set_property PACKAGE_PIN A17 [get_ports {DVI_R[1]}]
set_property PACKAGE_PIN A18 [get_ports {DVI_R[2]}]
set_property PACKAGE_PIN A19 [get_ports {DVI_R[3]}]
set_property PACKAGE_PIN C17 [get_ports {DVI_R[4]}]
set_property PACKAGE_PIN C18 [get_ports {DVI_R[5]}]
set_property PACKAGE_PIN C19 [get_ports {DVI_R[6]}]
set_property PACKAGE_PIN B19 [get_ports {DVI_R[7]}]

set_property DRIVE 8 [get_ports {DVI_R[7]}]
set_property DRIVE 8 [get_ports {DVI_R[6]}]
set_property DRIVE 8 [get_ports {DVI_R[5]}]
set_property DRIVE 8 [get_ports {DVI_R[4]}]
set_property DRIVE 8 [get_ports {DVI_R[3]}]
set_property DRIVE 8 [get_ports {DVI_R[2]}]
set_property DRIVE 8 [get_ports {DVI_R[1]}]
set_property DRIVE 8 [get_ports {DVI_R[0]}]

set_property PACKAGE_PIN B20 [get_ports DVI_DE]
set_property PACKAGE_PIN D20 [get_ports DVI_VS]
set_property PACKAGE_PIN C20 [get_ports DVI_HS]
set_property PACKAGE_PIN A22 [get_ports DVI_DKEN]
set_property PACKAGE_PIN A21 [get_ports DVI_CLK]
set_property PACKAGE_PIN C22 [get_ports {DVI_CTRL[0]}]
set_property PACKAGE_PIN E21 [get_ports {DVI_CTRL[1]}]
set_property PACKAGE_PIN D21 [get_ports {DVI_CTRL[2]}]
set_property PACKAGE_PIN D22 [get_ports DVI_ISEL]
set_property PACKAGE_PIN B22 [get_ports DVI_PWRDN]
set_property PACKAGE_PIN B21 [get_ports DVI_MSEN]

set_property DRIVE 8 [get_ports DVI_DE]
set_property DRIVE 8 [get_ports DVI_VS]
set_property DRIVE 8 [get_ports DVI_HS]
set_property DRIVE 8 [get_ports DVI_DKEN]
set_property DRIVE 8 [get_ports DVI_CLK]
set_property DRIVE 8 [get_ports {DVI_CTRL[0]}]
set_property DRIVE 8 [get_ports {DVI_CTRL[1]}]
set_property DRIVE 8 [get_ports {DVI_CTRL[2]}]
set_property DRIVE 8 [get_ports DVI_ISEL]
set_property DRIVE 8 [get_ports DVI_PWRDN]
set_property DRIVE 8 [get_ports DVI_MSEN]


set_false_path -from [get_clocks clk_fpga_0] -to [get_clocks SYS_CLK3]