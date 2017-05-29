ENTITY sklop IS PORT (
    a,b: in std_logic;
    c,d: out std_logic);
END sklop;

ARCHITECTURE arch OF sklop IS
    SIGNAL s1,s2: std_logic;
BEGIN
    s1 <= a AND b;
    s2 <= a AND s1;
    c <= s1 OR s2;
    d <= s1 XOR s2;
END arch;