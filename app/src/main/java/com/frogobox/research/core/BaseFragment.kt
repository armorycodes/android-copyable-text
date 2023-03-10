package com.frogobox.research.core

import androidx.fragment.app.Fragment
import com.frogobox.research.delegate.MainDelegate
import com.frogobox.research.delegate.MainDelegateImpl

/**
 * Created by Faisal Amir on 24/10/22
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */

abstract class BaseFragment : Fragment(),
    MainDelegate by MainDelegateImpl() {

}