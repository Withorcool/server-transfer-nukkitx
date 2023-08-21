    public void transfer(Player p, String address, int port) {
        InetSocketAddress addr = new InetSocketAddress(address, port);
        p.transfer(addr);
    }
