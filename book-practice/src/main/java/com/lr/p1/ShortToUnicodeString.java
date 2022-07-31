public class ShortToUnicodeString extends ArrayInitBaseListener{
    /**
     * 将 { 翻译为 "
     * @param ctx
     */
    @Override
    public void enterInit(ArrayInitParser.InitContext ctx) {
        super.enterInit(ctx);
        System.out.println('"');
    }

    /**
     * 将 } 翻译为 "
     * @param ctx
     */
    @Override
    public void exitInit(ArrayInitParser.InitContext ctx) {
        super.exitInit(ctx);
        System.out.println('"');
    }

    @Override
    public void enterValue(ArrayInitParser.ValueContext ctx) {
        int value = Integer.valueOf(ctx.INT().getText());
        System.out.printf("\\u%04x", value);
        super.enterValue(ctx);
    }
}
