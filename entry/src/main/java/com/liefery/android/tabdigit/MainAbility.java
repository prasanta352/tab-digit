package com.liefery.android.tabdigit;

import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.Slider;
import ohos.agp.components.Text;
import ohos.eventhandler.EventHandler;
import ohos.eventhandler.EventRunner;
import com.xenione.digit.TabDigit;
import ohos.multimodalinput.event.TouchEvent;


/**
 * MainAbility.
 */
public class MainAbility extends Ability implements Runnable {
    TabDigit tabDigit1;
    TabDigit tabDigit2;
    EventHandler eventHandler;

    int mAlpha = 0;

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);

        tabDigit1 = (TabDigit) findComponentById(ResourceTable.Id_charView1);
        tabDigit2 = (TabDigit) findComponentById(ResourceTable.Id_charView2);
        assert tabDigit1 != null;
        eventHandler = new EventHandler(EventRunner.getMainEventRunner());
        eventHandler.postTask(this, 1000);

        //        Text inputValue = (Text) findComponentById(ResourceTable.Id_value);
//
//        findComponentById(ResourceTable.Id_decrement).setTouchEventListener(
//                new RepeatListener(1000, 50,
//                        c -> {
//                            mAlpha--;
//                            inputValue.setText("mAlpha: " + mAlpha);
//                            tabDigit1.rotate(mAlpha);
//                        }));
//        findComponentById(ResourceTable.Id_increment).setTouchEventListener(new RepeatListener(1000, 50,
//                c -> {
//                    mAlpha++;
//                    inputValue.setText("mAlpha: " + mAlpha);
//                    tabDigit1.rotate(mAlpha);
//                }));
    }

    @Override
    public void run() {
        tabDigit1.start();
        tabDigit2.start();
        eventHandler.postTask(this, 1000);
    }

}
