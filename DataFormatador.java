 GregorianCalendar c = new GregorianCalendar();
        SimpleDateFormat df;
        df = new SimpleDateFormat("yyyy/MM/d");
        System.out.println(df.format(c.getTime()));
//Mês
        df = new SimpleDateFormat("yyyy/MMM/d");
        System.out.println(df.format(c.getTime()));
        df = new SimpleDateFormat("yyyy/MMMM/d");
        System.out.println(df.format(c.getTime()));
//Dia da semana
        df = new SimpleDateFormat("E d/MMMM/yyyy");
        System.out.println(df.format(c.getTime()));
        df = new SimpleDateFormat("EEEE d/MMMM/yyyy");
        System.out.println(df.format(c.getTime()));
//Semana
        df = new SimpleDateFormat("E d/MMMM/yyyy 'semana' w ");
        System.out.println(df.format(c.getTime()));
        df = new SimpleDateFormat("E d/MMMM/yyyy 'semana' W ");
        System.out.println(df.format(c.getTime()));
//Hora
        df = new SimpleDateFormat("E d/MMMM/yyyy 'hora ' H':'m':'s");
        System.out.println(df.format(c.getTime()));
//Data completa
        df = new SimpleDateFormat("'Novo Hamburgo,' EEEE d ' de ' MMMM ' de ' yyyy");
        System.out.println(df.format(c.getTime()));