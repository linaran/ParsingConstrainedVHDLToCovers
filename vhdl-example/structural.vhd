ENTITY sklop1 IS PORT(
    a,b: IN std_logic;
    f: OUT std_logic);
END sklop1;

ARCHITECTURE arch OF sklop1 IS
BEGIN
    f <= a NAND b;
END arch;

ENTITY sklop2 IS PORT(
    a,b,c: IN std_logic;
    y: OUT std_logic);
END sklop2;

ARCHITECTURE str OF sklop2 IS
    SIGNAL s1,s2: std_logic;
BEGIN
    c1: ENTITY work.sklop1 PORT MAP(a,b,s1);
    c2: ENTITY work.sklop1 PORT MAP(f => s2, a => b, b => c);
    c3: ENTITY work.sklop1 PORT MAP(s1, s2, y);
END str;