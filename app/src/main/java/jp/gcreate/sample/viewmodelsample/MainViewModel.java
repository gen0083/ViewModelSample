/*
 * Copyright 2018 gen0083
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jp.gcreate.sample.viewmodelsample;

import android.arch.lifecycle.ViewModel;
import android.util.Log;

public class MainViewModel extends ViewModel {
    private User user;
    private int count;

    public MainViewModel() {
        super();
        user = new User();
    }

    public User getUser() {
        return user;
    }

    public void setUserName(String name) {
        user.setName(name);
    }

    public void setUserSex(String sex) {
        user.setSex(sex);
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.d("test-vm", "onCleared: ");
    }
}
