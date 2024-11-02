package lotto.view;
import camp.nextstep.edu.missionutils.Console;
import lotto.model.CustomException;

public class InputView {
    private final String inputPurchaseAmountGuideMessage = "구입금액을 입력해 주세요.";
    private static final InputView instance = new InputView();
    private InputView(){}

    public static InputView getInstance(){
        return instance;
    }

    public int inputPrice(){
        System.out.println(inputPurchaseAmountGuideMessage);
        String price = Console.readLine();
        return Integer.parseInt(price);
    }
}