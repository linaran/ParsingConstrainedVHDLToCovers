ENTITY sklop IS PORT (
    a,b: in std_logic;
    f: out std_logic);
END sklop;

ARCHITECTURE arch OF sklop IS
BEGIN
    f <= a XOR b;
END arch;